<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<style>

</style>

<script type="text/javascript" src="../resources/js/jquery-3.3.1.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	  rel="stylesheet" id="bootstrap-css">

<head>
<link href="../resources/css/board/boardmain.css" rel="stylesheet"
	type="text/css">
<title>Start</title>
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
	<div style="float:right;" >
	<input type="text" value="검색하세요" ><input type="submit" value="검색">
	</div>
	
	<div class="one">용대의 게시판 페이지</div>
	
	<form id="ftpfrm" method="post">
		<div>
		
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
   		 			<td>${boardList.board_seq}</td>
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
	
	
	<div style="float:right;" >
	<form id="write">		
		<input id="write" type="button" onclick="javascript:board_write()"  value="글쓰기">
	</form>
	<form id="delete">		
		<input id="delete" type="button" onclick="javascript:board_delete()" value="삭제">
	</form>
	</div>

</body>

</html>
