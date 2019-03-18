package com.admin.employee.service;

import java.util.List;

import com.admin.employee.request.UserLoginRequest;
import com.admin.employee.response.UserLoginResponse;

/**
 * @author Balakrishna
 *
 */
public interface LoginService {
	
	/**
	 * @param userLoginRequest
	 * @return
	 */
	List<UserLoginResponse> userLogin(UserLoginRequest userLoginRequest);
	
}
