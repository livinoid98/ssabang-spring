package com.ssafy.ssabang.notice.model.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
	private int userNo;
	private String id;
	private String password;
	private String name;
	private String phone;
	private String email;
	private Date createdAt;
}
