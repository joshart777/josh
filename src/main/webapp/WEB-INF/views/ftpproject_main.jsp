<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html> 
<html>
 <script type="text/javascript" src="../resources/js/jquery-3.3.1.min.js" ></script>
<head>
<link href="../resources/css/main.css" rel="stylesheet" media="screen">
	<title>Start</title>
	<script type="text/javascript">
	 $(document).ready(function () {
	      
	  });
	 
	 
	function board_list(){		
		document.getElementById("ftpfrm").action = "/board_list.do";
	    document.getElementById("ftpfrm").submit();
	}
	
	function user_list(){
		
		document.getElementById("ftpfrm").action = "/user_list.do";
	    document.getElementById("ftpfrm").submit();
	}

	function join(){		
		document.getElementById("ftpfrm").action = "/join.do";
	    document.getElementById("ftpfrm").submit();
	}	
	

	
</script>
</head>

<body>
<h1>
	 <font size ="6">에스오오 조용대 대리입니다.<br/> 
	만나서 반가워요 <br/></font>

	<font size ="4" color="red">내 마음대로 홈페이지 만들기<br/></font>
	<font size ="4">문의는 010.4300.2564 조용대</font>
		
</h1>

<form id ="ftpfrm">
	
	<a href="javascript:test()">용대의 홈페이지</a> <br/><br/>
	<input type ="button"  onclick="javascript:board_list()" value="게시판페이지"  > <br/><br/>
	<input type ="button"  onclick="javascript:user_list()" value="회원리스트페이지"  > <br/><br/>
	<input type ="button"  onclick="javascript:join()" value="회원가입 하세요"  > <br/><br/>	
</form>


</body>

</html>
