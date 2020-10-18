<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>
<%
    request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<style>

</style>

<script type="text/javascript" src="../resources/js/jquery-3.3.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	  rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" type="text/css" href="/resources/css/styles.css">	  

<head>
<link href="../resources/css/board/boardmain.css" rel="stylesheet"
	type="text/css">
<title>Start</title>
<style type="text/css">
/* 	body {
	background-image: url("/resources/image/black_background.jpg");
	}	 */
	.masthead{padding-top:1rem; padding-bottom:0rem;}
</style>
<script type="text/javascript">

	$(document).ready(function(){
		
	});


	function board_write(){
		document.getElementById("write").action = "/board_write.do";
	    document.getElementById("write").submit();
	}
	
	function checkAll_(){		  
	      if( $("#checkAll").is(':checked') ){
	        $("input[name=checkRow]").prop("checked", true);
	      }else{
	        $("input[name=checkRow]").prop("checked", false);
	      }
	}
			
	/* 삭제(체크박스된 것 전부) */
function board_delete(){
  var checkRow = "";
  $( "input[name='checkRow']:checked" ).each (function (){
    checkRow = checkRow + $(this).val()+"," ;
  });
  checkRow = checkRow.substring(0,checkRow.lastIndexOf( ",")); //맨끝 콤마 지우기
 
  if(checkRow == ''){
    alert("삭제할 대상을 선택하세요.");
    return false;
  }
  console.log("### checkRow => "+checkRow);
 
  if(confirm("정보를 삭제 하시겠습니까?")){	       
      location.href="http://localhost:9022/board_delete.do?board_seq="+checkRow;      
  }
}

	
</script>
</head>

<body>
       	            
    <a class="navbar-brand js-scroll-trigger" style="color:black; font-size:17px;" href="http://localhost:8082">쇼핑몰 만들기</a>                    
	<div style="float:right;" >
	<input type="text" value="검색하세요" ><input type="submit" value="검색">
	</div>
			
	<form id="ftpfrm" method="post">
		<div style="font-size:150%;">
		
		<table class="table table-dark">
		<thead>
			<tr>							
				<th scope="col"><input type="checkbox" name="checkAll" id="checkAll" onclick="javascript:checkAll_()"></th>				
				<th scope="col">번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성자</th>
				<th scope="col">내용</th>
				<th scope="col">등록일자</th>
				<th scope="col">공지여부</th>
			</tr>
		</thead>
		
		
		<c:forEach var="boardList" items="${boardList}" >
				<tr>					
					<td><input type="checkbox" name="checkRow" id="checkRow" value="${boardList.board_seq}"></td>
					<td>${boardList.board_num}</td>					   		 			
    				<td>${boardList.board_title}</td>
    				<td>${boardList.board_writer_name}</td>
    				<td>${boardList.board_content_text}</td>
    				<td>${boardList.board_reg_data}</td>
    				<td>${boardList.board_notice}</td>    				
    			</tr>
		</c:forEach>
			</table>
		</div>

	</form>
	
	


	
	<div style="float:right;">
	
	<ul class="btn-group pagination" style="margin-right:30px;">
    <c:if test="${pageMaker.prev }">
    <li>
        <a href='<c:url value="/board_list.do?page=${pageMaker.startPage-1 }"/>'><i class="fa fa-chevron-left"></i></a>
    </li>
    </c:if>
    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="pageNum">
    <li>
        <a href='<c:url value="/board_list.do?page=${pageNum }"/>'><i class="fa">${pageNum }</i></a>
    </li>
    </c:forEach>
    <c:if test="${pageMaker.next && pageMaker.endPage > 0 }">
    <li>
        <a href='<c:url value="/board_list.do?page=${pageMaker.endPage+1 }"/>'><i class="fa fa-chevron-right"></i></a>
    </li>
    </c:if>
	</ul>
	
	<form id="write">
		<input id="delete"  style="float:right; margin-right:30px;" type="button" onclick="javascript:board_delete()" value="삭제">		
		<input id="write"  style="float:right; margin-right:5px;" type="button" onclick="javascript:board_write()"  value="글쓰기">		
	</form>	
		
	</div>
	
	        <!-- Bootstrap core JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"></script>
        <!-- Third party plugin JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <!-- Contact form JS-->
        <script src="/resources/assets/mail/jqBootstrapValidation.js"></script>
        <script src="/resources/assets/mail/contact_me.js"></script>
        <!-- Core theme JS-->
        <script src="/resources/js/scripts.js"></script> 

</body>

</html>
