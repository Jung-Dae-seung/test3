package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;





@Log4j2
@Controller
@RequestMapping("/member/*")
public class LoginController {

	
	@GetMapping("/login")
	public String loginGet() {
		log.info("�α��� �� ��û");
		
		return "/member/loginForm";
	}
	
	@GetMapping("/admin-page")
	public String adminPage() {
		log.info("admin");
		return "/member/AdminPage";//�ӽ� �����
	}
	
	@GetMapping("/login-error")
	public String loginError(Model model) {
		
		model.addAttribute("loginError", "���̵� �Ǵ� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
		
		return "/member/loginForm";
	}
	
}