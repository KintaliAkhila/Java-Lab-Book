package com.cg.donor.dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.List;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.exception.DonorException;
import com.cg.donor.util.DBConnection;

public class DonorDAOImpl implements IDonorDAO {

	@Override
	public String addDonor(DonorBean donor) throws DonorException {
		Connection connection=DBConnection.getConnection();
		return null;
	}

	@Override
	public DonorBean viewDonorDetails(String donorId) throws DonorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List retrieveAll() throws DonorException {
		// TODO Auto-generated method stub
		return null;
	}

}
