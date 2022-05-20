package com.muni.service;

import com.muni.dao.MuniDAO;
import com.muni.dao.MuniDAOInterface;
import com.muni.entity.MuniUser;

public class MuniService implements MuniServiceInterface {

	public int createProfileService(MuniUser mu) {
		
		MuniDAOInterface md = new MuniDAO();
		int i = md.createProfileDAO(mu);
		return i;
		
	}

}
