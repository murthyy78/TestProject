package com.capgemini.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.lms.dao.UserAddressDao;
import com.capgemini.lms.entities.UserAddress;

@Service
public class UserAddressServiceImpl implements UserAddressService {

	@Override
	public UserAddress addUserAddress(UserAddress address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAddress updateUserAddressDetails(UserAddress address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserAddress(int addressId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserAddress viewAddressByUserId(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAddress> viewUserAddressList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}