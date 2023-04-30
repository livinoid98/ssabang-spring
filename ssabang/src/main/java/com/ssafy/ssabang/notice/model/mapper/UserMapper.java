package com.ssafy.ssabang.notice.model.mapper;

import com.ssafy.ssabang.notice.model.dto.User;

public interface UserMapper {
	User select(User user);
	int insert(User user);
}
