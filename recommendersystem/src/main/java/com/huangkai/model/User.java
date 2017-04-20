package com.huangkai.model;

public class User {
	private Integer userid;

	private String username;

	private String password;
	
	private boolean checkboxstate;

	public Integer getUserid() {
		return userid;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username
				+ ", password=" + password + ", checkboxstate=" + checkboxstate
				+ "]";
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getCheckboxstate() {
		return checkboxstate;
	}

	public void setCheckboxstate(boolean checkboxstate) {
		this.checkboxstate = checkboxstate;
	}

	public boolean equals(User user) {
		if (! (user instanceof User)) {
			return false;
		} else {
			if (this.getUsername().equals(user.getUsername()) && this.getPassword().equals(user.getPassword())){
				return true;
			} else {
				return false;
			}
		}
		
	}

}