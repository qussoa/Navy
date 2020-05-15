package com.biz.navy.service;

public interface ProductService {

	// 상품등록
	public int insert(ProductVO productVO);
	
	// 상품수정
	public int update(ProductVO productVO);
	
	// 상품삭제
	public int delete(long p_code);
	
	// 상품전체리스트
	public String selectAll();
	
	// 상품조회
<<<<<<< Updated upstream
	public String findById();
=======
	public ProductVO findById(long p_code);

	
>>>>>>> Stashed changes
}
