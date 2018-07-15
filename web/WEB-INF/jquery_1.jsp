<%--
  Created by IntelliJ IDEA.
  User: surverules
  Date: 6/28/2018
  Time: 4:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jquery_1</title>
</head>

<script
        src="https://code.jquery.com/jquery-3.3.1.js"
        integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
        crossorigin="anonymous">

</script>

<body>
<input type="button" id="button", value="Click Me">

<script>
    $(function(){
        $("#button").click(function(){
            alert("jquery")
        });
    });

</script>

</body>
</html>
