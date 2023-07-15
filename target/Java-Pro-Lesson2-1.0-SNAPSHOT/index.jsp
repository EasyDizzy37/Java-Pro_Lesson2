<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lesson Two_Homework</title>
</head>
<body>

<form action="/poll" method="POST">
    <h2> Який жанр музики ви полюбляєте? </h2>
    <label> <input type="radio" name="genre" value="Jazz"> Jazz</label>
    <label> <input type="radio" name="genre" value="Rock"> Rock</label>
    <br>
    <h2> На якій платформі ви слухаєте музику? </h2>
    <label> <input type="radio" name="platform" value="Sound Cloud"> Sound Cloud</label>
    <label> <input type="radio" name="platform" value="YouTube Music"> YouTube Music</label>
    <br>
    <br>
    <input type="submit" value="submit"/>
</form>
</body>
</html>