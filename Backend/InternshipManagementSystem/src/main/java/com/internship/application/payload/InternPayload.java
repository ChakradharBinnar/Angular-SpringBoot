package com.internship.application.payload;

public class InternPayload { 
	
	private int internId;

	public int getInternId() {
		return internId;
	}

	public void setInternId(int internId) {
		this.internId = internId;
	}

	public InternPayload(int internId) {
		super();
		this.internId = internId;
	}

	public InternPayload() {
		super();
		// TODO Auto-generated constructor stub
	}
}
