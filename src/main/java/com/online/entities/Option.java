package com.online.entities;

public class Option {
	private int optionId;
	private String optionText;
	private Question question;
	public Option() {
	}
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public String getOptionText() {
		return optionText;
	}
	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Option(String optionText, Question question) {
		this.optionText = optionText;
		this.question = question;
	}
	
}
