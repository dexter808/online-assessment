package com.online.entities;

public class Record {
	private int recordId;
	private String text;
	private Option option;
	private User examinee;
	public Record() {}
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
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
	public User getExaminee() {
		return examinee;
	}
	public void setExaminee(User examinee) {
		this.examinee = examinee;
	}
	public Record(int recordId, String text, Option option, User examinee) {
		this.recordId = recordId;
		this.text = text;
		this.option = option;
		this.examinee = examinee;
	}
	
}
