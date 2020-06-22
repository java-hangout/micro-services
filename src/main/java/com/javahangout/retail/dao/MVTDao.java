package com.javahangout.retail.dao;

import com.javahangout.retail.model.CreateNewValueChainReq;
import com.javahangout.retail.model.CreateNewValueChainRes;

public interface MVTDao {

	public CreateNewValueChainRes createNewValueChain(CreateNewValueChainReq chainReq);

}
