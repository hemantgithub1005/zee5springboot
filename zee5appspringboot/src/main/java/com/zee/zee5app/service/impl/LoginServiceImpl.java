package com.zee.zee5app.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.dto.ROLE;
import com.zee.zee5app.repository.LoginRepository;
import com.zee.zee5app.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;
	public LoginServiceImpl() throws IOException{
		// TODO Auto-generated constructor stub
		// loginRepository=LoginRepositoryImpl.getInstance();
	}
	
	
	
	@Override
	public String addCredentials(Login login) {
		// TODO Auto-generated method stub
		//return loginRepository.addCredentials(login);
		return null;
	}

	@Override
	public String deleteCredentials(String userName) {
		// TODO Auto-generated method stub
	//	return loginRepository.deleteCredentials(userName);
		return null;
	}

	@Override
	public String changePassword(String userName, String password) {
		// TODO Auto-generated method stub
	//	return loginRepository.changePassword(userName, password);
		return null;
	}

	@Override
	public String changeRole(String userName, ROLE role) {
		// TODO Auto-generated method stub
	//	return loginRepository.changeRole(userName, role);
		return null;
	}

		
	

	

	}