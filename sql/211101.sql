create table board(
idx INT NOT NULL AUTO_INCREMENT ,
    title VARCHAR(100) NOT NULL,
    content VARCHAR(3000) NOT NULL,
    writer VARCHAR(20) NOT NULL ,
    password VARCHAR(20) NOT NULL,
    view_cnt INT NOT NULL DEFAULT 0 ,
    insert_time DATETIME NOT NULL DEFAULT NOW(),
    PRIMARY KEY (idx)
);

create table comment(
cIdx INT NOT NULL AUTO_INCREMENT ,
    title VARCHAR(100) NOT NULL,
    content VARCHAR(3000) NOT NULL,
    writer VARCHAR(20) NOT NULL ,
    insert_time DATETIME NOT NULL DEFAULT NOW(),
    idx INT NOT NULL,
    PRIMARY KEY (cIdx),
    CONSTRAINT `FK_idx` FOREIGN KEY (`idx`) REFERENCES board.board(`idx`)
);