package com.dao;

import com.beans.Train;

public interface TrainDao {
	
	public void create(Train t);
	public Train get(String idTrain);

}
