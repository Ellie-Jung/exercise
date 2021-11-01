<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<style type="text/css">
.row {
	margin: 0px auto;
	width: 900px;
}

h1 {
	text-align: center;
}
</script>
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<h1>스프링 게시판</h1>
			<table class="table">
				<tr>
					<td><a href="#" class="btn btn-sm btn-primary">새글</a>
					</td>
				</tr>
			</table>
			<table class="table table-striped">
				<tr class="danger">
					<th class="text-center" width=10%>번호</th>
					<th class="text-center" width=45%>제목</th>
					<th class="text-center" width=15%>이름</th>
					<th class="text-center" width=20%>작성일</th>
				</tr>
				<c:forEach var="list" items="${list}">
					<tr>
						<td class="text-center" width=10%>${list.idx }</td>
						<td class="text-left" width=45%><a
							href="#">${list.title }</a></td>
						<td class="text-center" width=15%>${list.writer }</td>
						<td class="text-center" width=20%><fmt:formatDate
								value="${list.insert_time}" pattern="yyyy-MM-dd" /></td>
					</tr>
				</c:forEach>
			</table>
			<table class="table">
				<td class="text-center"><a href="#"
					class="btn btn-sm btn-primary">이전</a> ${curpage } page /
					${totalpage } pages <a href="#" class="btn btn-sm btn-primary">다음</a>
				</td>
			</table>
		</div>
	</div>
</body>
</html>