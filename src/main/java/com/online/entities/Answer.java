package com.online.entities;

public class Answer {
	private int answerId;
	private String text;
	private Option option;
	private Question question;
	public Answer() {}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Option getOption() {
		return option;
	}
	public void setOption(Option option) {
		this.option = option;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Answer(String text, Option option, Question question) {
		this.text = text;
		this.option = option;
		this.question = question;
	}
	
}
