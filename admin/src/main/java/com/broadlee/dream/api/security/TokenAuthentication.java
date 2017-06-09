package com.broadlee.dream.api.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;

import java.util.Collections;

public class TokenAuthentication extends AbstractAuthenticationToken {

	private static final long serialVersionUID = 1712786265425544071L;

	private String token;

	public String getToken() {
		return token;
	}

	public TokenAuthentication(String token) {
		super(Collections.EMPTY_LIST);
		this.token = token;
	}

	@Override
	public Object getCredentials() {
		return token;
	}

	@Override
	public Object getPrincipal() {
		return token;
	}

}
