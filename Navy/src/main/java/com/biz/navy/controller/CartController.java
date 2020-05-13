package com.biz.navy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/cart")
public class CartController {


	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list() {
		
		return "cart";
	}
	
	@RequestMapping(value="/buy", method=RequestMethod.GET)
	public String buy() {
		
		return "buy";
	}
	
	
}
