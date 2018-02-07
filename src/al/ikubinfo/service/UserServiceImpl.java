package al.ikubinfo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import al.ikubinfo.entity.User;


public class UserServiceImpl implements UserService {

	@Override
	public void createUser(User user) {
		System.out.println("user...");		
	}

}
