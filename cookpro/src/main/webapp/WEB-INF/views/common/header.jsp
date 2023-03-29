<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />

<table border="0" width="100%"">
	<tr>
		<td>
			<h1><font size="30">header</font></h1>
		</td>
		<td>
			<c:choose>
				<c:when test="${isLogOn == true && member != null }">
					<h3>환영합니다. ${member.name }님!</h3>
					<a href="${contextPath }/member/logout.do"><h3>로그아웃</h3></a>
				</c:when>
				<c:otherwise>
					<a href="${contextPath }/member/memberForm.do"><h3>회원가입</h3></a>
					<a href="${contextPath }/member/loginForm.do"><h3>로그인</h3></a>
				</c:otherwise>
			</c:choose>
		</td>
	</tr>
</table>