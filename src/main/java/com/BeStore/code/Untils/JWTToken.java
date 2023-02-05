package com.BeStore.code.Untils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JWTToken {
	private static final Logger logger = LoggerFactory.getLogger(JWTToken.class);
	private final String JWT_SECRECT = "bachmocSecretKey";
	private final long JWT_EXPIRATION = 3600000;
	
	
}
