<%--
  Created by IntelliJ IDEA.
  User: sergexu
  Date: 2017/5/15
  Time: 下午10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        document.write("<div>welcome to test page</div>");
        function reload(){window.location.reload()};
    </script>
</head>
<body>

<h2>${message}</h2>
<input type="button" value="refreshing" name="refresh" title="刷新" onclick="reload()">
</body>
</html>
