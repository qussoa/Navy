package com.biz.navy.service;

import java.util.List;

import com.biz.navy.domain.ProductImgVO;

public interface ProductImgService {

	public List<ProductImgVO> selectAll();
	
	public ProductImgVO findByPImgSeq(long p_img_seq);

}
