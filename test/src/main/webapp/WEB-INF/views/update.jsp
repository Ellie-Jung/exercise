<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<style type="text/css">
.row {
   margin: 0px auto;
   width:700px;
}
h1 {
   text-align: center;
}
</style>
 
</head>
<body>
  <div class="container">
    <div class="row">
     <h1>수정하기</h1>
     <form method=post  onsubmit="return form_submit(this.form)">
     <table class="table">
       <tr>
        <th class="text-right danger" width=15%>이름</th>
        <td width=85%>
          <input type=text name=writer size=15 value="${board.writer}" required>
          <input type=hidden name=idx value="${board.idx }">
        </td>
       </tr>
       
       <tr>
        <th class="text-right danger" width=15%>제목</th>
        <td width=85%>
          <input type=text name=title size=50 value="${board.title}" required>
        </td>
       </tr>
       
       <tr>
        <th class="text-right danger" width=15%>내용</th>
        <td width=85%>
          <textarea rows="8" cols="55" name=content required>${board.content}</textarea>
        </td>
       </tr>
       <tr>
        <th class="text-right danger" width=15% >비밀번호</th>
        <td width=85%>
          <input type="password" name=password id="pw" size=10 required>
           <input type=hidden  id="opw" value="${board.password }">
           <span id="msgchk"></span>
        </td>
       </tr>
       
       <tr>
        <td colspan="2" class="text-center">
          <input type=submit value="수정">
          <input type=button value="취소" onclick="javascript:history.back()">
        </td>
       </tr>
     </table>
     </form>
    </div>
    
    <script>
    var check=true;
   	function form_submit(form){
   		if(check) form.submit;
   		else return false;
   	}
    
    $(document).ready(function(){
    	
    	
    	
    	$('#pw').keyup(function(){
    		if($('#pw').val() != $('#opw').val()){
    			$('#msgchk').html('비밀번호가 틀렸습니다.');
    			check=false;
    		}else {
    			$('#msgchk').html('비밀번호가 일치합니다.');
    			check=true;
    		}
    	})
    	
    })
    
    </script>
    
    
  </div>
</body>
</html>