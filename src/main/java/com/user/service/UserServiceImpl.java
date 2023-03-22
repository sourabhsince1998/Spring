package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl  implements UserService
{

	
	
	//fake user list
	List<User> list=List.of(
			               new User(1311L,"Durgesh","23232325"),
	                        new User(1312L,"Durgesh2","232323253"),
	                         new User(1313L,"Durgesh3","2323232520")
	                         );
		 
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}
	

}
