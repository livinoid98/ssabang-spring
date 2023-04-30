package com.ssafy.ssabang.notice.model.service;

import com.ssafy.ssabang.notice.model.dto.User;

public interface UserService {
	User select(User user);
	int insert(User user);
}
