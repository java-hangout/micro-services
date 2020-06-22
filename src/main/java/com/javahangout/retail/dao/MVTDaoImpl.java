package com.javahangout.retail.dao;

import org.springframework.stereotype.Repository;

import com.javahangout.retail.model.CreateNewValueChainReq;
import com.javahangout.retail.model.CreateNewValueChainRes;
@Repository
public class MVTDaoImpl implements MVTDao{

	@Override
	public CreateNewValueChainRes createNewValueChain(CreateNewValueChainReq chainReq) {
		CreateNewValueChainRes chainRes = new CreateNewValueChainRes();
		chainRes.setName(chainReq.getName());
		chainRes.setClient(chainReq.getClient());
		chainRes.setMineLocation(chainReq.getMineLocation());
		chainRes.setMiningMethod(chainReq.getMiningMethod());
		chainRes.setCommodity(chainReq.getCommodity());
		return chainRes;
	}

}
