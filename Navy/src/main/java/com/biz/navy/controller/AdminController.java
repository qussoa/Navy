package com.biz.navy.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.navy.domain.UserDetailsVO;
import com.biz.navy.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping(value="/admin")
public class AdminController {

	private final UserService userService;
	
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

	// 회원 리스트
	@RequestMapping(value="/userlist",method=RequestMethod.GET)
	public String userList(Model model) {
		
		List<UserDetailsVO> userList =  userService.selectAll();
		model.addAttribute("userList", userList);
		
		return "admin/admin_userList";
	}
	
	// 회원 디테일
	@RequestMapping(value="/user_detail_view/{username}",method=RequestMethod.GET)
	public String userDetailView(@PathVariable("username") String username, Model model) {
		
		UserDetailsVO userVO =  userService.findByUserName(username);
		model.addAttribute("userVO", userVO);
		
		return "admin/admin_userDetail";
	}
	
	@RequestMapping(value="/user_detail_view/{username}",method=RequestMethod.POST)
	public String userDetailView(@PathVariable("username") String username, UserDetailsVO userVO, String[] auth, Model model) {
		
		for(String a : auth) {
			log.debug("AUTH: " + a);
		}
		
		int ret = userService.update(userVO, auth);
		
		return "redirect:/admin/user_detail_view/" + userVO.getUsername();
	}
	
	// 권한 삭제
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String auth_delete(@RequestParam("id") long id, UserDetailsVO userVO) {
		
		int ret = userService.delete(id);
		
		return "redirect:/admin/user_detail_view/" + userVO.getUsername();
	}
	
	// 상품 정보
	@RequestMapping(value="/productlist",method=RequestMethod.GET)
	public String productlist() {
		
		return "admin/admin_allList";
	}
	
	// 주문 정보
	@RequestMapping(value="/orderlist",method=RequestMethod.GET)
	public String orderlist() {
		
		return "admin/admin_orderList";
	}
	
	// Q&A 정보
	@RequestMapping(value="/qna",method=RequestMethod.GET)
	public String qna() {
		
		return "admin/admin_qna";
	}
	
	// 리뷰 정보
	@RequestMapping(value="/review",method=RequestMethod.GET)
	public String review() {
		
		return "admin/admin_review";
	}
	
	// 재고 정보
	@RequestMapping(value="/inventory",method=RequestMethod.GET)
	public String inventory() {
		
		return "admin/admin_inventory";
	}
	
	// 고객센터 정보
	@RequestMapping(value="/support",method=RequestMethod.GET)
	public String support() {
		
		return "admin/admin_support";
	}

}
