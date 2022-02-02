package com.zee.zee5app.service;

import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.dto.ROLE;

@Service
public interface LoginService {

	public String addCredentials(Login login);

	public String deleteCredentials(String userName);

	public String changePassword(String userName,String password);


	public String changeRole(String userName,ROLE role);



}