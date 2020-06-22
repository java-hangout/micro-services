package com.javahangout.retail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javahangout.retail.dao.MVTDao;
import com.javahangout.retail.model.CreateNewValueChainReq;
import com.javahangout.retail.model.CreateNewValueChainRes;

@Service
public class MVTServiceImpl implements MVTService {

	@Autowired
	MVTDao dao;

	@Override
	public CreateNewValueChainRes createNewValueChain(CreateNewValueChainReq chainReq) {
		CreateNewValueChainRes chainRes = dao.createNewValueChain(chainReq);
		return chainRes;
	}

}
