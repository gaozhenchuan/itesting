package com.fujias.itesting.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fujias.itesting.base.controller.BaseSelectController;

@RequestMapping("/longin")
public class LoginController extends BaseSelectController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("111111111111111111111111");
		return super.handleRequestInternal(request, response);
	}

}
