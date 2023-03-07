<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
<link href="<c:url value='/resources/css/summernote-bs4.min.css'></c:url>" rel="stylesheet">
<script src="<c:url value='/resources/js/summernote-bs4.min.js'></c:url>"></script>
</head>
<body>
<h1>게시글 등록</h1>
<form action="<c:url value='/board/insert'></c:url>" method="post">
	<div class="form-group">
		<label>타입</label>
		<select name="bo_bt_num" class="form-control">
			<option value="0">게시판을 선택하세요.</option>
			<c:forEach items="${typeList}" var="type">
				<option value="${type.bt_num}">${type.bt_name }</option>
			</c:forEach>
		</select>
	</div>
	<div class="form-group">
		<label>제목</label>
		<input type="text" name="bo_title" class="form-control">
	</div>
	<div class="form-group">
		<label>내용</label>
		<textarea name="bo_content" class="form-control"></textarea>
	</div>
	<div class="form-group">
		<label>첨부파일</label>
		<input type="file" name="files" class="form-control">
		<input type="file" name="files" class="form-control">
		<input type="file" name="files" class="form-control">
	</div>
	<button class="btn btn-outline-success col-12 mb-2">게시글 등록</button>
</form>
<a class="btn btn-outline-primary" href="<c:url value='/board/list'></c:url>">목록</a>
<script type="text/javascript">
$('[name=bo_content]').summernote({
	placeholder: '내용을 입력하세요.',
	tabsize: 2,
	height: 400
});
</script>
</body>
</html>