package com.zhuzhiguang.applicant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhuzhiguang.applicant.dao.ApplicantMapper;
import com.zhuzhiguang.applicant.entity.Applicant;
import com.zhuzhiguang.applicant.service.ApplicantService;

@Service
public class ApplicantServiceImpl implements ApplicantService{

	/**
	 * 
	 */
	@Autowired
	ApplicantMapper ap;
	
	@Override
	public List<Applicant> list() {
		// TODO Auto-generated method stub
		return ap.list();
	}

}
