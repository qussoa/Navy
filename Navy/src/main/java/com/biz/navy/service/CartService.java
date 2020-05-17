package com.biz.navy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.biz.navy.domain.CartListVO;
import com.biz.navy.domain.CartVO;

@Service
public interface CartService {

	// 장바구니 개수
	public String cartCount();
	
	public int countDelivery();
	
	// 카트에서 선택하기
	public List<CartVO> selectCart(String username);
	
	// 선택목록 주문하기
	public List<CartVO> selectDelivery(String username);
	
	// 장바구니 담기
	public String insert(CartVO cartVO);
	
	// 장바구니에 담긴 상품 단품 개수 수정
	public String qty_update(long seq, long p_qty);
	
	// 장바구니 상품 삭제
	public String deleteOne(long longSeq);
	
	// 장바구니 선택된 상품 삭제
	public String cart_list_delete(List<String> seqList);
	
	// 장바구니 상품 전체 수량 수정
	public void cart_list_qty_update(CartListVO cartList);
	
	// 장바구니에서 결제가기
	public Integer cart_to_delivery(List<String> buyList);
	
	// 장바구니 담겨진 상품 총 금액
	public String sum();
	
}
