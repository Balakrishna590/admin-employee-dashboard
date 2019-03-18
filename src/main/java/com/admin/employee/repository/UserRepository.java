package com.admin.employee.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.admin.employee.entites.RoleEntity;

/**
 * @author Balakrishna
 *
 */
@Repository
@Transactional
public interface UserRepository<T, ID extends Serializable> extends JpaRepository<RoleEntity, Long> {

	@Query("SELECT RE FROM RoleEntity RE WHERE RE.userId = :uid AND RE.password = :pwd")
	RoleEntity findUserByUserIdAndPassword(@Param("uid") String userId, @Param("pwd") String password);
	
	@Query("SELECT COUNT(RE) FROM RoleEntity RE WHERE RE.userId = :uid AND RE.password = :pwd AND RE.role = 'admin'")
	int findAdminUserByUserIdAndPassword(@Param("uid") String userId, @Param("pwd") String password);
	
	

	/*
	 * @Query("SELECT u FROM User u WHERE u.status = :status and u.name = :name")
	 * User findUserByStatusAndNameNamedParams(   @Param("status") Integer status, @Param("name") String name);
	 */

}
