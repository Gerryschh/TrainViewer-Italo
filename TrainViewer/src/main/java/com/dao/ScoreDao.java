package com.dao;

import com.beans.Score;

public interface ScoreDao {
	
	public void create(Score s);
	public Score get(String idScore);
	
}
