package com.zee.zee5app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.exception.InvalidIdLengthException;
import com.zee.zee5app.exception.InvalidNameException;

@Service
public interface UserService {

	public String addUser(Register register);
	public String updateUser(String id, Register register);
	public Optional<Register> getUserById(String id) throws IdNotFoundException, InvalidNameException, InvalidIdLengthException;
	public Optional<List<Register>> getAllRegisters() throws InvalidIdLengthException, InvalidNameException;
	public String deleteUserById(String id) throws IdNotFoundException, InvalidNameException, InvalidIdLengthException;
	public Register[] getAllUsers() throws InvalidIdLengthException, InvalidNameException;
}