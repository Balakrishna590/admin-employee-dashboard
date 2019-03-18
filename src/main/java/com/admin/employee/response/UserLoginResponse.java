/**
 * 
 */
package com.admin.employee.response;

/**
 * @author Balakrishna
 *
 */
public class UserLoginResponse {

	private Long id;
	private String profile_image;
	private String userId;
	private String password;
	private String name;
	private String role;
	private String dob;
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("User Login Response : [ id = ");
		sb.append(id);
		sb.append(" profile_image = ");
		sb.append(profile_image);
		sb.append(" userId = ");
		sb.append(userId);
		sb.append(" password = ");
		sb.append(password);
		sb.append(" name = ");
		sb.append(name);
		sb.append(" role = ");
		sb.append(role);
		sb.append(" dob = ");
		sb.append(dob);
		sb.append(" address = ");
		sb.append(address);
		return sb.toString();
	}
}
