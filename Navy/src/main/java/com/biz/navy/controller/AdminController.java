package com.biz.navy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/admin")
public class AdminController {

	@RequestMapping(value="",method=RequestMethod.GET)
	public String admin() {
		
		return "admin/admin_home";
	}
	
//	<li><a href="${rootPath}/admin/userlist">회원 리스트</a></li>
//	<li><a href="${rootPath}/admin/productlist">상품 정보</a></li>
//	<li><a href="${rootPath}/admin/orderlist">주문 정보</a></li>
//	<li><a href="${rootPath}/admin/qna">QNA</a></li>
//	<li><a href="${rootPath}/admin/review">리뷰</a></li>
//	<li><a href="${rootPath}/admin/inventory">재고</a></li>
//	<li><a href="${rootPath}/admin/support">고객센터</a></li>

	@RequestMapping(value="/productlist",method=RequestMethod.GET)
	public String userList() {
		
		return "admin/admin_allList";
	}
}
