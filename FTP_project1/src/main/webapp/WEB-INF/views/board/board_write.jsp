<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<style>

</style>

<script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>

<head>
<link href="../resources/css/board/boardmain.css" rel="stylesheet"
	type="text/css">
<title>Start</title>
<script type="text/javascript">
	$(document).ready(function() {
		
	});
	
	function board_insert(){
		
		alert("abc");
		document.getElementById("menu").action = "/board/board_insert.do";
	    document.getElementById("menu").submit();
	    
	}
</script>
</head>

<body>
	
	<div class="one">게시판 페이지</div>
	<div>　</div>
	
	<form id="menu" method="post" action="">
			<table class="table table-dark">
			<thead>
				<tr>
					<th scope="col">공지여부</th>
					<th scope="col"><input id="board_notice" name="board_notice" placeholder="공지여부를 입력하세요" value="${Ftp_projectBoardVO.board_notice}"></th>
					<th scope="col">제목</th>
					<th scope="col"><input id="board_title" name="board_title" placeholder="제목을 입력하세요" value="${Ftp_projectBoardVO.board_title}"></th>
					<th scope="col">작성자</th>
					<th scope="col"><input id="board_writer_name" name="board_writer_name" placeholder="작성자를 입력하세요" value="${Ftp_projectBoardVO.board_writer_name}"></th>
				</tr>
			</thead>
			</table>
				<input id="board_content_text" style="width:100%; height:150px; letter-spacing: 1px" placeholder="내용을 입력하세요" value="${Ftp_projectBoardVO.board_content_text}">
				<div style="float:right;" >
					<input type="button" onclick="javascript:board_insert()" value="작성">
					<input type="button" onclick="alert('hello')" value="취소">
				</div>
	</form>

</body>

</html>
