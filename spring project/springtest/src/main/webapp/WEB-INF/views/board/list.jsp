<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table class="table table-hover">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>추천/비추천</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody>
	<!-- spring 게시글 조회 (복습) - 8번
	 서버에서 보낸 게시글 리스트를 <c:forEach>와 <table>를 이용하여 화면에 출력
	 제목은 <a>를 이용하여 링크를 추가 : /board/detail/게시글번호
	 -->
		<c:forEach items="${list}" var="board">
			<tr>
				<td>${board.bo_num}</td>
				<td>
					<a href="<c:url value='/board/detail/${board.bo_num }'></c:url>">
					${board.bo_title }
					</a>
				</td>
				<td>${board.bo_me_id }</td>
				<td>${board.bo_register_date }</td>
				<td>${board.bo_up}/${board.bo_down }</td>
				<td>${board.bo_views}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>