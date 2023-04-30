package com.ssafy.ssabang.notice.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssabang.notice.model.dto.User;
import com.ssafy.ssabang.notice.model.mapper.UserMapper;

@RestController
public class UserServiceImpl implements UserService{
	
	private UserMapper mapper;
	
	@Autowired
	public UserServiceImpl(UserMapper mapper) {
		super();
		this.mapper = mapper;
	}

	@Override
	public User select(User user) {
		User selected = mapper.select(user);
		if(selected == null) {
			return null;
		}else {			
			if(selected.getPassword().equals(user.getPassword())) {
				return selected;
			}else {
				return null;
			}
		}
	}

	@Override
	public int insert(User user) {
		return mapper.insert(user);
	}

}
