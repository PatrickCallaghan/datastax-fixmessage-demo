package com.datastax.fixmessage.model;

public class FixUpdate {
	private String field;
	private Object value;
	private int id;

	public FixUpdate(String field, Object value, int id) {
		super();
		this.field = field;
		this.value = value;
		this.id = id;
	}
	public String getField() {
		return field;
	}
	public Object getValue() {
		return value;
	}
	public int getId() {
		return id;
	}

}
