package com.broadlee.dream.api.security;

import com.broadlee.dream.api.wrapper.ErrorMsgWrapper;
import com.broadlee.dream.common.json.JsonResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ApiAuthenticationFailureHandler implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		new JsonResponse(response)
		.with("status", HttpServletResponse.SC_UNAUTHORIZED)
		.with("data", ErrorMsgWrapper.error("unauthorized").withMsg(exception.getMessage()))
		.done();
	}

}
