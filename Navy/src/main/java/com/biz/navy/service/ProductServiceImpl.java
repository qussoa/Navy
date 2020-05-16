package com.biz.navy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.biz.navy.dao.ProductDao;
import com.biz.navy.domain.ProductVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
	
	private final ProductDao proDao;
	
	@Override

	public int insert(ProductVO productVO) {
		return proDao.insert(productVO);
	}

	@Override
	public int update(ProductVO productVO) {
		return proDao.update(productVO);
	}

	@Override
	public int delete(long p_code) {
		// TODO Auto-generated method stub
		return proDao.delete(p_code);
	}

	@Override
	public List<ProductVO> selectAll() {
		return proDao.selectAll();
	}

	@Override
	public ProductVO findById(long p_code) {
		return proDao.findById(p_code);
	}

}
