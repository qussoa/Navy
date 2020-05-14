package com.biz.navy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.biz.navy.domain.AuthorityVO;

public interface AuthoritiesDao {

	public void insert(List<AuthorityVO> authList);

	@Select("SELECT * FROM tbl_authority "
			+ " WHERE username = #{username} ")
	public List<AuthorityVO> findByUserName(String username);

	@Delete("DELETE FROM tbl_authority WHERE username = #{username}")
	public void delete(String username);

}
