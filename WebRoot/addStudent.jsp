<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'addStudent.jsp' starting page</title>
    <link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/lib/bootstrap/css/bootstrap.css" />
	<script src="lib/jquery/jquery-1.11.1.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="lib/bootstrap/js/bootstrap.js" type="text/javascript"
		charset="utf-8"></script>
  <script type="text/javascript">
  $(function(){
			$("#name").blur(function(){
				var name = $(this).val();
				$.post(
					"${pageContext.request.contextPath}/student?method=checkName",
					{"name":name},
					function(data){
						if(data.isExit) {
							$("#nameInfo").html("该用户名已经存在");
							$("#nameInfo").css("color","red");
						}else {
							$("#nameInfo").html("该用户名可用");
							$("#nameInfo").css("color","blue");
						}
					},
				"json"
			);
		});
	});

  </script>
  </head>
  <body>
    <form action = "${pageContext.request.contextPath}/student/add.action" method="post">
    <p>姓名</p><p><input type="text" class="form-control" placeholder="姓名" id="name" name = "name" value="name"/>
    <span id="nameInfo"></span></p>
    <p>年龄</p><p><input type="text" class="form-control" placeholder="年龄" name = "age"  /></p>
    <p>性别</p><p><input type="text" class="form-control" placeholder="性别" name = "gender" /></p>
    <p>生日</p><p><input type="text" class="form-control" placeholder="生日" name = "birthday" /></p>
    <p>密码</p><p><input type="text" class="form-control" placeholder="密码" name = "password"/></p>
    <p><button type = "submit" >保存 </button></p>
    </form>
  </body>
</html>
