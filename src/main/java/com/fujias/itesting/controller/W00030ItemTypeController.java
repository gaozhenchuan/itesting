package com.fujias.itesting.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/W00030")
public class W00030ItemTypeController  {

	@RequestMapping("/login")
	@ResponseBody
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {


		System.out.println("11111111111111111111111111111111");
	}
}
