package com.github.springboot.starter.security;

import java.util.Optional;

import com.github.springboot.starter.config.Constants;

/**
 * Utility class for Spring Security.
 */
public class SecurityUtils {
	
	/**
     * Get the login of the current user.
     *
     * @return the login of the current user
     */
	public static Optional<String> getCurrentUserLogin() {
		return Optional.of(Constants.SYSTEM_ACCOUNT);
	}
	
}
