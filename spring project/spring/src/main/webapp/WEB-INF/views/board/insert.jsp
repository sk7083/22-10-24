<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link href="<c:url value ='/resources/css/summernote-bs4.min.css'></c:url>" rel="stylesheet">
<script src="<c:url value ='/resources/js/summernote-bs4.min.js'></c:url>"></script>
<div class="container">
	<h1>게시글 작성</h1>
	<form action="<c:url value='/insert'></c:url>" method="post">
		<div class="form-group">
			<label for="type">게시판:</label>
			<select class="form-control" name="bt_type" id="type">
				<option value=""></option>
			</select>
		</div>
		<div class="form-group">
			<label for="title">제목:</label>
			<input type="text" class="form-control" id="title" name="bo_title">
		</div>
			<div class="form-group">
			<label for="content">내용:</label>
		<textarea id="contents" name="bo_content"></textarea>
		<div class="form-group">
			<label for="type">첨부파일:</label>
			
			
		</div>		
		<button class="btn btn-outline-success col-12 mt-3">회원가입</button>
	</form>
</div>
<script>
      $('#content').summernote({
        placeholder: '내용을 입력하세요.',
        tabsize: 2,
        height: 400
      });
</script>




