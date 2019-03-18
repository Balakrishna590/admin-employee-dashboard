package com.admin.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.employee.request.UserLoginRequest;
import com.admin.employee.response.UserLoginResponse;
import com.admin.employee.service.LoginService;

@RestController
@RequestMapping("/user")
public class UserLoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody List<UserLoginResponse> userlogin(@RequestBody UserLoginRequest userLoginRequest) {
		List<UserLoginResponse> userLoginResponses = loginService.userLogin(userLoginRequest);
		return userLoginResponses;
	}
}
