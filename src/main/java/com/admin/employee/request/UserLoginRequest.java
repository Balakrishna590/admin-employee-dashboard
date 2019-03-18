package com.admin.employee.request;

import java.io.Serializable;

public class UserLoginRequest implements Serializable {

	/**
	 * Generated serialVersionUID
	 */
	private static final long serialVersionUID = 7423897595035868309L;

	private String userId;
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("User Login Request : [ userId = " );
		sb.append(userId);
		sb.append(" password = ");
		sb.append(password);
		return sb.toString();
	}
}
