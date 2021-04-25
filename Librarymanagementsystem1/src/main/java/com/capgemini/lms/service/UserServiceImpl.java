package com.capgemini.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.lms.dao.UsersDao;
import com.capgemini.lms.entities.Users;
import com.capgemini.lms.exception.UserNotFoundException;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UsersDao usersDao;

	@Override
	public Users register(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users loginValidate(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelSubscription(int userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payThePenalty(int userid, double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Users> viewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users updateUserDetails(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}
}












