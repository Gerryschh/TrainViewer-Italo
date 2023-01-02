package com.dao.impl;

import com.beans.Train;
import com.dao.TrainDao;

public class TrainDaoImpl extends BaseDao implements TrainDao{

	@Override
	public void create(Train t) {
		super.create(t);
	}

	@Override
	public Train get(String idTrain) {
		return (Train) super.get(Train.class, idTrain);
	}

}
