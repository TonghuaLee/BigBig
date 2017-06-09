package com.broadlee.dream.service;


import com.broadlee.dream.common.BaseService;
import com.broadlee.dream.domain.User;

import java.util.List;


public interface UserService extends BaseService<User> {
		/**
	 * 普通用户登录
	 */
	User tryLogin(String phone, String passwd);

	List<User> findAllUsers();

	User findUserByPhone(String phone);

	User saveUser(User user);

	User saveUser(User user, boolean register);

	User registerUser(String phone, String password);

	boolean changePasswd(String passwd, Long id);

	User readUserById(Long userId);

	void deleteUser(User user);

	User createUserFromId(Long userId);

	User createNewUser();

	void createRegisteredUserRoles(User user);

	String encodePassword(String rawPassword);

	boolean isPasswordValid(String rawPassword, String encodedPassword);

	String getPhoneById(Long id);

	boolean updateAvatarUrl(Long id, String newurl);

	boolean updateNickname(Long id, String name);

}
