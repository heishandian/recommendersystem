$(document).ready(function() {
	/*var test = "<option value=1>huangkai</option>";
	$("#test").html(test);
	alert("register");*/
	getFilmType();


	$("#test").change(function(){ 
		//getSewageByareaId();
		alert("复选框改变了");
	});
}

);



function getFilmType() {
	$.ajax({
		type : "POST",
		url : getRootPath() + "/user/register.do",
		dataType : "json",
		contentType : "application/json;charset=utf-8",
		/*data : JSON.stringify(postdata),*/
		async : false,
		success : function(data) {
			var result;
			for(var i=0;i<data.length;i++){
				//特别注意," + data[i].username+ "这是一个整体,这个不需要转义
				result += "<option value=\""+data[i].id+"\">" + data[i].username+ "</option>";
			}
			$("#test").append(result);
			//alert());
		}
	});
}

function getRootPath() {
	// 获取当前网址，如： http://localhost:8088/test/test.jsp
	var curPath = window.document.location.href;
	// 获取主机地址之后的目录，如： test/test.jsp
	var pathName = window.document.location.pathname;
	var pos = curPath.indexOf(pathName);
	// 获取主机地址，如： http://localhost:8088
	var localhostPaht = curPath.substring(0, pos);
	// 获取带"/"的项目名，如：/test
	var projectName = pathName
			.substring(0, pathName.substr(1).indexOf('/') + 1);
	return (localhostPaht + projectName);
}