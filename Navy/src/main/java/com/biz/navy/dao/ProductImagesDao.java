package com.biz.navy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.biz.navy.domain.ProductImgVO;

public interface ProductImagesDao {

	@Select("SELECT * FROM tbl_p_images")
	public List<ProductImgVO> selectAll();
	
	@Select("SELECT * FROM tbl_p_images WHERE p_img_seq = #{p_img_seq}")
	public ProductImgVO findByPImgSeq(long p_img_seq);
	
}
