package com.capgemini.lms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.lms.entities.UserAddress;

@Service
public interface UserAddressService {
	public UserAddress addUserAddress(UserAddress address);
	public UserAddress updateUserAddressDetails(UserAddress address);
	public void deleteUserAddress(int addressId);
	public UserAddress viewAddressByUserId(int userid);
	public List<UserAddress> viewUserAddressList();
}
