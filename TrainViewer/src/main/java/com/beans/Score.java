package com.beans;

public class Score implements Bean {
	private int idScore;
	private String score;
	private User userMail;

	public int getIdScore() {
		return idScore;
	}
	public void setIdScore(int idScore) {
		this.idScore = idScore;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public User getUserMail() {
		return userMail;
	}
	public void setUserMail(User userMail) {
		this.userMail = userMail;
	}
	
		
}
