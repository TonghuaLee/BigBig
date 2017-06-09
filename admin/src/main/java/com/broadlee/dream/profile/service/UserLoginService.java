package com.broadlee.dream.profile.service;


import com.broadlee.dream.domain.User;

public interface UserLoginService {
	
    User loginUser(User user);

    User loginUser(String username, String passwd);

    void logoutUser();

}
