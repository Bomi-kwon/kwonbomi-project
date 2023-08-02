<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="게시판" />
<%@ include file="../common/head.jsp" %>

<section>
	<div>
		<div>
			<table>
				<thead>
					<tr>
						<th>No.</th>
						<th>제목</th>
						<th>작성자 ID</th>
						<th>작성시간</th>
						<th>조회</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="article" items="${articles }">
						<tr>
							<td>${article.id }</td>
							<td>${article.title }</td>
							<td>${article.writerID }</td>
							<td>${article.create_at }</td>
							<td>${article.hit }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</section>

<%@ include file="../common/foot.jsp" %>