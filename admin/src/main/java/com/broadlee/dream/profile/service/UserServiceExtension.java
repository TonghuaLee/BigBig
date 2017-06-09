package com.broadlee.dream.profile.service;


import com.broadlee.dream.common.extension.ExtensionHandler;
import com.broadlee.dream.common.extension.ExtensionResultStatus;
import com.broadlee.dream.domain.User;

public interface UserServiceExtension extends ExtensionHandler {
	
	 ExtensionResultStatus postRegisterUser(User user);
	
}
