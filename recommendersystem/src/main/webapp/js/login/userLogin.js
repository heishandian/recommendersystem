//$(document).ready(getUserMessage());

function login() {
	var button = document.getElementById("submit");
	button.addEventListener("click", getUserMessage());
}

function getUserMessage() {
	var username;
	var password;
	//username = document.getElementById("username").value;
	username = $("#username").val();
	password = $("#username").val();
	alert(username);
}