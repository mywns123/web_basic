<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>다중 파일 업로드 테스트</h1>
	<form action="partUploadPro2" method="post" enctype="multipart/form-data">
		<label for="writer">작성자 :</label>
		<input type="text" name="writer" id="writer"><br>
		<label for="partFile1">업로드 파일 :</label>
		<input type="file" name="partFile1" id="partFile1"><br>
		<label for="partFile2">업로드 파일 :</label>
		<input type="file" name="partFile2" id="partFile2"><br>
		<input type="submit" value="다중 업로드">
	</form>
</body>
</html>