package com.capgemini.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.lms.entities.UserAddress;

@Repository
public interface UserAddressDao extends JpaRepository<UserAddress, Integer>{
	//public int addUserAddress(UserAddress address);
	//public int updateUserAddressDetails(UserAddress address) throws AddressNotFoundException;
	//public int deleteUserAddress(int addressId) throws AddressNotFoundException;
	//public UserAddress viewAddressByUserId(int userid) throws AddressNotFoundException;
	//public List<UserAddress> viewUserAddressList();
}
