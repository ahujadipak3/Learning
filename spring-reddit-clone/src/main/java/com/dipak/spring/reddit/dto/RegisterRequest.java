package com.dipak.spring.reddit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterRequest {

	private String username;
	private String password;
	private String email;
}
