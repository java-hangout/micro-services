package com.javahangout.retail.service;

import com.javahangout.retail.model.CreateNewValueChainReq;
import com.javahangout.retail.model.CreateNewValueChainRes;

public interface MVTService {
	public CreateNewValueChainRes createNewValueChain(CreateNewValueChainReq chainReq);
}
