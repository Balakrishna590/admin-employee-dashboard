/**
 * 
 */
package com.admin.employee.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.employee.entites.RoleEntity;
import com.admin.employee.repository.UserRepository;
import com.admin.employee.request.UserLoginRequest;
import com.admin.employee.response.UserLoginResponse;
import com.admin.employee.service.LoginService;

/**
 * @author Balakrishna
 *
 */
@Service(value = "userLoginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userRepository;

	public List<UserLoginResponse> userLogin(UserLoginRequest userLoginRequest) {
		List<UserLoginResponse> userLoginResponses = new ArrayList<UserLoginResponse>();
		UserLoginResponse userLoginResponse = null;
		List<RoleEntity> roleEntites = null;

		RoleEntity roleEntity = userRepository.findUserByUserIdAndPassword(userLoginRequest.getUserId(),
				userLoginRequest.getPassword());

		if (roleEntity.getRole().equals("admin"))
			roleEntites = userRepository.findAll();
		if (roleEntites != null) {
			for (RoleEntity entity : roleEntites) {
				if (entity != null) {
					userLoginResponse = new UserLoginResponse();
					userLoginResponse.setId(entity.getId());
					userLoginResponse.setProfile_image(entity.getProfileImage());
					userLoginResponse.setUserId(entity.getUserId());
					userLoginResponse.setPassword(entity.getPassword());
					userLoginResponse.setName(entity.getName());
					userLoginResponse.setRole(entity.getRole());
					userLoginResponse.setDob(entity.getDob());
					userLoginResponse.setAddress(entity.getAddress());
				}
				userLoginResponses.add(userLoginResponse);
			}
		} else if (roleEntity.getRole().equals("employee")) {
			if (roleEntity != null) {
				userLoginResponse = new UserLoginResponse();
				userLoginResponse.setId(roleEntity.getId());
				userLoginResponse.setProfile_image(roleEntity.getProfileImage());
				userLoginResponse.setUserId(roleEntity.getUserId());
				userLoginResponse.setPassword(roleEntity.getPassword());
				userLoginResponse.setName(roleEntity.getName());
				userLoginResponse.setRole(roleEntity.getRole());
				userLoginResponse.setDob(roleEntity.getDob());
				userLoginResponse.setAddress(roleEntity.getAddress());
			}
			userLoginResponses.add(userLoginResponse);
		}
		return userLoginResponses;
	}

}
