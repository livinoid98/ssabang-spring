package com.ssafy.ssabang.notice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssabang.notice.model.dto.User;
import com.ssafy.ssabang.notice.model.service.UserService;

@RestController
public class NoticeController {
	
	private UserService service;
	
	@PostMapping("/login")
	public String login(@ModelAttribute User user, HttpSession httpSession) {
		User selected = service.select(user);
		httpSession.setAttribute("userInfo", selected);
		return "redirect:/";
	}
}
