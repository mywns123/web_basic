<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원의 정보 입력 폼</title>
<style>
ul { list-style: none; }
li { margin: 20px; }
li label {	width: 100px;	float: left; }
h2 { text-align: center;}
</style>
</head>
<body>
	<h2>회원의 정보 입력 폼</h2>
	<form action="addMember.jsp">
		<fieldset>
			<legend>회원 가입</legend>
			<ul>
				<li>
					<label for="name">이름</label>
					<input type="text" name="name" size="20" id="name" autofocus required>
				</li>
				<li>
					<label for="userId">아이디</label>
					<input type="text" name="userId" size="20" id="userId">
				</li>
				<li>
					<label for="nickName">별명</label>
					<input type="text" name="nickName" size="20" id="nickName">
				</li>
				<li>
					<label for="pwd">비밀번호</label>
					<input type="password" name="pwd" size="20" required id="pwd">
				</li>
				<li>
					<label for="email"> 이메일</label>
					<input type="email" name="email" size="20" id="email">
				</li>
				<li>
					<label for="tel">전화번호</label>
					<input type="tel" name="phone" size="11" id="tel">
				</li>
				<li>
					<input type="submit" value="가입"><input type="reset" value="취소"> 
				</li>
			</ul>
		</fieldset>

	</form>
</body>
</html>