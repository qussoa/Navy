package com.biz.navy.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.biz.navy.dao.CartDao;
import com.biz.navy.domain.CartListVO;
import com.biz.navy.domain.CartVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CartServiceImpl implements CartService{

	private final CartDao cartDao;

	@Override
	public String cartCount() {

		return cartDao.cartCount();
	}

	@Override
	public int countDelivery() {

		return cartDao.countDelivery();
	}

	@Override
	public List<CartVO> selectCart(String username) {

		return cartDao.selectCart(username);
	}

	@Override
	public List<CartVO> selectDelivery(String username) {

		return cartDao.selectDelivery(username);
	}

	@Override
	public String insert(CartVO cartVO) {

		cartVO.setP_status("CART");
		return cartDao.insert(cartVO);
	}

	@Override
	public String qty_update(long seq, long p_qty) {

		return cartDao.update(seq, p_qty);
	}

	@Override
	public String deleteOne(long longSeq) {

		return cartDao.delete(longSeq);
	}

	@Override
	public String cart_list_delete(List<String> seqList) {

		return cartDao.cart_list_delete(seqList);
	}

	@Transactional
	public void cart_list_qty_update(CartListVO cartList) {
		
		int nSize = cartList.getP_qty().size();
		for(int i = 0; i < nSize ; i++) {
			cartDao.qty_update(cartList.getSeq().get(i),
								cartList.getP_qty().get(i));
		}
		
	}
	@Override
	public Integer cart_to_delivery(List<String> buyList) {

		return cartDao.cart_to_delivery(buyList);
	}

	@Override
	public String sum() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
