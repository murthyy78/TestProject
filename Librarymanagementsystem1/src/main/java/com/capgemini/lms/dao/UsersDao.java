
package com.capgemini.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.lms.entities.Users;

@Repository
public interface UsersDao extends JpaRepository<Users, Integer>{
	//public int register(Users user);
	//public Users loginValidate(String username,String password) throws UserNotFoundException;
	//public void cancelSubscription(int userid) throws UserNotFoundException;
	//public int payThePenalty(int userid, double amount) throws UserNotFoundException;
	//public List<Users> viewAllUsers();
	//public int updateUserDetails(Users user) throws UserNotFoundException;
	//public int deleteUser(int id) throws UserNotFoundException;
}
