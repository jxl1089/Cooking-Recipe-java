<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 창</title>

<script>
	function search(){
	     location.href = "/test1/member/search.do";
	}
</script>

<c:set var="msg" value="${param.msg }" />
<c:if test="${msg == 'success' }">
	<script>
		window.onload = function(){
			alert("사용 가능합니다.");
		}
	</script>
</c:if>
<c:if test="${msg == 'fail' }">
	<script>
		window.onload = function(){
			alert("사용 불가능합니다. 다시 입력해주세요.");
		}
	</script>
</c:if>

</head>
<body>
	<form method="post" action="/test1/member/addMember.do">
		<h1 style="text-align:center;">회원 가입 창</h1>
		<table align="center">
			<tr>
				<td width="200"><p align="right">아이디</p></td>
				<td width="400"><input type="text" name="id"></td>
				<td width="100"><button type="button" onclick="search()">중복확인</button></td>
			</tr>
			<tr>
				<td width="200"><p align="right">암호</p></td>
				<td width="400"><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">이메일</p></td>
				<td width="400"><input type="email" name="email"></td>
				<td width="100"><input type="button" value="중복확인"><a href="/test1/member/search.do"></a></td>
			</tr>
			<tr>
				<td width="200"><p align="right">이름</p></td>
				<td width="400"><input type="text" name="name"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">성별</p></td>
				<td width="400"><input type="radio" name="gender" value="남성">남성<input type="radio" name="gender" value="여성">여성</td>
			</tr>
			<tr>
				<td width="200"><p align="right">인증번호</p></td>
				<td width="400"><input type="text" name="autoNo"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">&nbsp;</p></td>
				<td width="400">
					<input type="submit" value="가입하기">
					<input type="reset" value="다시입력">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>