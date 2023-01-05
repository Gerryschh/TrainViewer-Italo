package com.dao.impl;

import com.beans.Score;
import com.dao.ScoreDao;

public class ScoreDaoImpl extends BaseDao implements ScoreDao{

	public void create(Score s) {
		super.create(s);
	}

	@Override
	public Score get(String idScore) {
		return (Score) super.get(Score.class, idScore);
	}
}
