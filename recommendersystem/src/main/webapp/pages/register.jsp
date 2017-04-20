<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
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
<title>user register</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport"content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<meta name="keywords" content="recommender system,user register">
<meta name="description" content="user register">
<link rel="shortcut icon" href="../images/register/favicon.ico" />
<link href="../css/register/style/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/register/jquery.js"></script>
<script type="text/javascript"src="../js/register/jquery.i18n.properties-1.0.9.js"></script>
<script type="text/javascript"src="../js/register/jquery-ui-1.10.3.custom.js"></script>
<script type="text/javascript" src="../js/register/jquery.validate.js"></script>
<script type="text/javascript" src="../js/register/md5.js"></script>
<script type="text/javascript" src="../js/register/page_regist.js?lang=zh"></script>
<script src="../js/laydate/laydate.js"></script>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/register/register.js"></script> --%>
<!-- <script type="text/javascript" src="../js/register/register.js"></script> -->
</head>
<body class="loginbody">
	<div class="dataEye">
		<div class="loginbox registbox">
	  <!-- <div class="logo-a">
				<a href="login.jsp" title="js代码网">
					<img src="../images/register/logo-a.png">
				</a>
			</div> -->
			<br> <br> <br>
			<div class="login-content reg-content">
				<div class="loginbox-title">
					<h3>用户注册</h3>
				</div>
				<form id="signupForm">
					<div class="login-error"></div>
					<div class="row">
						<label class="field" for="email">注册邮箱</label> <input type="text"
							value="" class="input-text-user noPic input-click" name="email"
							id="email">
					</div>
					<div class="row">
						<label class="field" for="password">密码</label> <input
							type="password" value=""
							class="input-text-password noPic input-click" name="password"
							id="password">
					</div>
					<div class="row">
						<label class="field" for="passwordAgain">确认密码</label> <input
							type="password" value=""
							class="input-text-password noPic input-click"
							name="passwordAgain" id="passwordAgain">
					</div>
					<div class="row">
							<label>性别</label>：&nbsp;&nbsp;	
							男<input type="radio" name="sex" value="man"/>&nbsp;	
							女<input type="radio" name="sex" value="woman"/>	
							&nbsp;&nbsp;<label>出生年月：</label>
						    <input class="laydate-icon" style="width:88px" onclick="laydate()"><br/>
					</div>
					<div class="row">
						<label>喜欢电影类型：&nbsp;&nbsp;</label>
						<select id="test" style="width:220px ;height:28px" name="areaid" id="areaid">
							<option value="-1">-----------请选择电影类型----------</option>
							<c:forEach items="${movie_genres}" var="item">
								<option value=${item.id}>${item.genres}</option>
							</c:forEach>
						</select>
					</div>
					<div class="row tips">
						<input type="checkbox" id="checkBox"> <label> 我已阅读并同意 <a href="#" target="_blank">隐私政策、服务条款</a> </label>
					</div>
					<div class="row btnArea">
						<a class="login-btn" id="submit" style="color:white;background:#3770a7">注册</a>
					</div>
				</form>
			</div>
			<div class="go-regist">
				<lable>已有帐号,请<a href="<%=basePath%>user/gotoLoginPage.do" class="link">登录</a></lable>
			</div>
		</div>

	<!--<div id="footer">
			<div class="dblock">
				<div class="inline-block"> <img src="../images/register/logo-gray.png"> </div>
				<div class="inline-block copyright">
					<p><a href="#">关于我们</a> | <a href="#">微博</a> | <a href="#">隐私政策</a> | <a href="#">人员招聘</a></p>
					<p> Copyright © 2017 Black Lighting</p>
				</div>
			</div>
		</div>-->
		
	</div>
	<div class="loading">
		<div class="mask">
			<div class="loading-img">
				<img src="../images/register/loading.gif" width="31" height="31">
			</div>
		</div>
	</div>
</body>
</html>

