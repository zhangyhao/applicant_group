package com.zhuzhiguang.applicant.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zhuzhiguang.applicant.entity.Applicant;

/**
 * 
 * @author zhuzg
 *
 */
public interface ApplicantMapper {

	@Select("SELECT * FROM applicant ORDER BY aid DESC ")
	List<Applicant> list();

}
