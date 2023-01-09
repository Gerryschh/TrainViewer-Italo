package com.dao.impl;

import java.util.Date;

import com.beans.Train;
import com.dao.TrainDao;

public class TrainDaoImpl extends BaseDao implements TrainDao{

	@Override
	public void create(Train t) {
		super.create(t);
	}

	@Override
	public Train getId(String idTrain) {
		return (Train) super.get(Train.class, idTrain);
	}


	@Override
	public Train getMat(String matTrain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Train getDep(String departure) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Train getArr(String arrival) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Train getHour(Date hour) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Train getFactory(int factory) {
		// TODO Auto-generated method stub
		return null;
	}

}
