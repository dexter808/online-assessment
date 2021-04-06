package com.online.entities;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Test {
	private int testId;
	private User testAdmin;
	private Date testStart;
	private Date testEnd;
	private Time testDuration;
	private List<Question> questions;
	public Test() {
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public User getTestAdmin() {
		return testAdmin;
	}
	public void setTestAdmin(User testAdmin) {
		this.testAdmin = testAdmin;
	}
	public Date getTestStart() {
		return testStart;
	}
	public void setTestStart(Date testStart) {
		this.testStart = testStart;
	}
	public Date getTestEnd() {
		return testEnd;
	}
	public void setTestEnd(Date testEnd) {
		this.testEnd = testEnd;
	}
	public Time getTestDuration() {
		return testDuration;
	}
	public void setTestDuration(Time testDuration) {
		this.testDuration = testDuration;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public Test(User testAdmin, Date testStart, Date testEnd, Time testDuration, List<Question> questions) {
		this.testAdmin = testAdmin;
		this.testStart = testStart;
		this.testEnd = testEnd;
		this.testDuration = testDuration;
		this.questions = questions;
	}
	
}
