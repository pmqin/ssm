<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- jstl标签库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script>
$(function(){
	//更新事件
	$('.btn').click(function(){
		var btn = $(this);
		var td = btn.parent();//父级 -->找到td标签 td对应列
		var tr = td.parent();//父级 -->找到tr标签 tr对应行
		//class 用 .
		var u_id = tr.find(".id").val();
		//id 用 #
		var userName = tr.find("#userName").val();//tr 行里面找对应的列 根据id或者class来找
		var pwd = tr.find(".password").val();
		//alert("获取到：id = "+u_id+" name :"+userName +" PWD "+pwd);
		var data = {  
				"id" : u_id,  
	            "userName" : userName,  
	            "password" : pwd,  
	        };  
		$.ajax({  
	            type : "GET",  
	            url : "update",  
	            data : data,  
	            dataType : "json",  
	            contentType : 'application/x-www-form-urlencoded; charset=UTF-8',  
	            success : function(value) {  
	            	//提交成功 - 逻辑错误要在这里面判别
	               alert(value.message); //message 对应Controller里面的update方法返回的Map的key
	                
	            },  
	            error : function(json) {  
	                alert("这是提交过程中的一些错误（参数获取错误，提交方式get。post与后台不匹配等），不包括逻辑错误");  
	            }  
	        }) 
	});	
})
</script>

<body>
<h3>SpringMVC+ibatis  demo</h3>
	<div>所有用户：</div>

	<form name="input" method="post">
		<table border="0.5">
			<tr>
				<th>id</th>
				<th>账号</th>
				<th>密码</th>
				<th></th>
				<th></th>
			</tr>
			<!-- SpringMVC后台传值 前台遍历展示 user对应User对象-->
			<c:forEach var="user" items="${users}"><!-- 头部有导入 jstl标签库 -->
				<tr>
					<td><input class = "id" name="id" type="text" value=${user.id }></td>
					<td><input id = "userName" name="userName" type="text" value=${user.userName }></td>
					<td><input class="password" name="password" type="text" value=${user.password }></td>
					<td><input value="删除" type="submit"></td>
					<td><input class="btn" type = "button" value = "修改"/></td>
				</tr>
			</c:forEach>
		</table>
	</form>

	<div>=============================================</div>

	添加新用户：
	<!-- 会对应到Controller里面的insert方法  userName ，password 对应成(SpringMVC框架)User 属性名要一一样-->
	<form action="insert" method="post" dir="ltr">
		账号：<input name="userName" type="text"><br> 密码：<input
			name="password" type="text" value="123456"><br> <input
			value="添加" type="submit"><br>
	</form>
</body>
</html>