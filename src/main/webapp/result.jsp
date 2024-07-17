<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Calculator</title>

<style>
img {
    height: 20%;
    width: 20%;
    margin-top: 20px;
}

img:hover {
    -ms-transform: scale(1.1); /* IE 9 */
    -webkit-transform: scale(1.1); /* Safari 3-8 */
    transform: scale(1.1);
}

body {
    font-size: 40px;
    text-align: center;
    background: linear-gradient(to right, #2b40ff, #07121a);
}

h1, h3 {
    color: white;
    margin: 15px;
}

input, button {
    font-size: 40px;
    color: white;
    border-radius: 5%;
    background-color: black;
    border: 2px solid white;
}
</style>

</head>
<body>

    <img src="joke.webp">
    <h1>Joke of the day!</h1>
    <h3>😂=<%= request.getAttribute("joke") %>🚩</h3>

    <form action="MyServlet" method="get">
        <input type="text" name="num1" placeholder="First Number">
        <input type="text" name="num2" placeholder="Second Number">

        <button type="submit" name="bt1" value="1">+</button>
        <button type="submit" name="bt1" value="2">-</button>
        <button type="submit" name="bt1" value="3">*</button>
        <button type="submit" name="bt1" value="4">/</button>
    </form>
    
    <h1>Ans=<%= request.getAttribute("result") %>🚩</h1>

</body>
</html>