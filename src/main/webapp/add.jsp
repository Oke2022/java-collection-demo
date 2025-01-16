<!DOCTYPE html>
<html>
<head>
    <title>Response Page</title>
</head>
<body bgcolor="orange">
    <%

     int i = Integer.parseInt(request.getParameter("num1"));
     int j = Integer.parseInt(request.getParameter("num2"));
     int k = i + j;

     out.println("Output : " + k);

     %>
</body>
</html>