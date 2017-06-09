package com.broadlee.dream.profile.service;


import com.broadlee.dream.common.extension.ExtensionManager;
import com.broadlee.dream.common.extension.ExtensionResultStatus;
import com.broadlee.dream.domain.User;
import org.springframework.stereotype.Component;


@Component("userServiceExtensionManager")
public class UserServiceExtensionManager extends ExtensionManager<UserServiceExtension> implements UserServiceExtension{

	public UserServiceExtensionManager() {
		super(UserServiceExtension.class);
	}

	@Override
	public boolean continueOnHandled() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public ExtensionResultStatus postRegisterUser(User user) {
		return getProxy().postRegisterUser(user);
	}
}
