<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%
	//设置无缓存
	response.addHeader("Progma", "no-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Cache-Control", "must-revalidate");
%>
<!DOCTYPE html>
<html lang="en" class="no-js">

<head>
<title>Movies intelligent recommendation system</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="description" content="Movies, intelligent, recommendation system " />
<meta name="keywords" content="Movies, intelligent, recommendation system" />
<link rel="stylesheet" type="text/css" href="../css/login/style.css" />
<script type="text/javascript" src="../js/jquery/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="../js/login/userLogin.js"></script>
</head>

<body>
	<div class="wrapper">
		<h1>
			<!-- Movies intelligent -->
			TENG YUE<br>
			<!-- recommendation system -->
			SHI YE
		</h1>
		<!-- <h2>Made by huangkai Jiangnan University</h2> -->
		<div class="content">
			<div id="form_wrapper" class="form_wrapper">
				<form class="register">
					<h3>Register</h3>
					<div class="column">
						<div>
							<label>First Name:</label> <input type="text" /> <span
								class="error">This is an error</span>
						</div>
						<div>
							<label>Last Name:</label> <input type="text" /> <span
								class="error">This is an error</span>
						</div>
						<div>
							<label>Website:</label> <input type="text" value="http://" /> <span
								class="error">This is an error</span>
						</div>
					</div>
					<div class="column">
						<div>
							<label>Username:</label> <input type="text" /> <span
								class="error">This is an error</span>
						</div>
						<div>
							<label>Email:</label> <input type="text" /> <span class="error">This
								is an error</span>
						</div>
						<div>
							<label>Password:</label> <input type="password" /> <span
								class="error">This is an error</span>
						</div>
					</div>
					<div class="bottom">
						<div class="remember">
							<input type="checkbox" /> <span>Send me updates</span>
						</div>
						<input type="submit" value="Register" /> <a href="index.html"
							rel="login" class="linkform">You have an account already?
							Login here</a>
						<div class="clear"></div>
					</div>
				</form>
				<form class="login active">
					<h3>Login</h3>
					<div>
						<label>Username:</label> <input type="text" id="username" /> <span
							class="error" style="border:1px solid red">This is an
							error</span>
					</div>
					<div>
						<label>Password: <a href="forgot_password.html"
							rel="forgot_password" class="forgot linkform">Forgot your
								password?</a> </label> <input type="password" id="userpassword" /> <span
							class="error">This is an error</span>
					</div>
					<div class="bottom">
						<div class="remember">
							<input type="checkbox" id="remmenberme"
							<!-- onmouseup="checkboxOnclick(this);" -->
							<span>Keep me logged in</span>
						</div>
						<input type="submit" value="Login" id="submit"
						<!-- onclick="return false" -->
						</input> <a href="<%=basePath%>user/gotoRegisterPage.do" rel="register"
							class="linkform">You don't have an account yet? Register here</a>
						<div class="clear"></div>
					</div>
				</form>
			</div>
			<div class="clear"></div>
		</div>
		<a class="back" href="#/">返回</a>
	</div>

</body>
</html>