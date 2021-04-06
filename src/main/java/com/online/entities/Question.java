package com.online.entities;

import java.util.List;

public class Question {
	private int qustionId;
	private Test test;
	private String questionText;
	private int numberOfOptions;
	private List<Option> options;
	private Answer answer;
	public Question() {}
	public int getQustionId() {
		return qustionId;
	}
	public void setQustionId(int qustionId) {
		this.qustionId = qustionId;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public int getNumberOfOptions() {
		return numberOfOptions;
	}
	public void setNumberOfOptions(int numberOfOptions) {
		this.numberOfOptions = numberOfOptions;
	}
	
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Question(Test test, String questionText, int numberOfOptions, List<Option> options, Answer answer) {
		this.test = test;
		this.questionText = questionText;
		this.numberOfOptions = numberOfOptions;
		this.options = options;
		this.answer = answer;
	}
	
}
