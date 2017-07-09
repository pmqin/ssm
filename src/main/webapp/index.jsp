<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE ">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Insert title here</title>  
<!-- 新 Bootstrap 核心 CSS 文件 -->  
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">  
  
<!-- 可选的Bootstrap主题文件（一般不用引入） -->  
<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">  
  
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->  
<script src="bootstrap/js/jquery.min.js"></script>  
  
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->  
<script src="bootstrap/js/bootstrap.min.js"></script>  
</head>  
<body>  
    <%-- <form action="${pageContext.request.contextPath }/user/login.do" method="post">  
    userName:<input type="text" name="userName" value="${user.userName }"/><br/>  
    password:<input type="password" name="password" value="${user.password }"><br/>  
    <input type="submit" value="login"/><font color="red">${errorMsg }</font>  
</form> --%>  
    <div style="vertical-align: middle;margin-top: 10%;">  
        <div class="container-fluid" style="width: 500px;">  
            <div class="row-fluid">  
                <div class="span10">  
                    <h3>ibatis+spring demo</h3>  
                    <form class="form-horizontal"  
                        action="${pageContext.request.contextPath }/user/login.do"  
                        method="post">  
                        <div class="form-group">  
                            <label for="inputUserName" class="col-sm-2 control-label">UserName</label>  
                            <div class="col-sm-10">  
                                <input type="${user.userName }" class="form-control"  
                                    id="UserName" placeholder="UserName" name="userName">  
                            </div>  
                        </div>  
                        <div class="form-group">  
                            <label for="inputPassword" class="col-sm-2 control-label">Password</label>  
                            <div class="col-sm-10">  
                                <input type="password" class="form-control" id="inputPassword3"  
                                    placeholder="Password" name="password"  
                                    value="${user.password }">  
                            </div>  
                        </div>  
                        <div class="form-group" align="left">  
                            <div class="col-sm-offset-2 col-sm-10">  
                                <div class="checkbox">  
                                    <label> <input type="checkbox"> Remember me  
                                    </label>  
                                </div>  
                            </div>  
                        </div>  
                        <div class="form-group" align="left">  
                            <div class="col-sm-offset-2 col-sm-10">  
                                <button type="submit" class="btn btn-default">Sign in</button>  
                            </div>  
                        </div>  
                    </form>  
                </div>  
            </div>  
        </div>  
    </div>  
</body>  
</html> 