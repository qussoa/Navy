package com.biz.navy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/product")
public class ProductController {

	@RequestMapping(value="list", method=RequestMethod.GET)
	public String productList() {
	
		return "allList";
	}
	
	@RequestMapping(value="/detail")
	public String detail() {
		
		return "detail";
	}

}
