package com.internship.application.customResponse;

import java.util.List;

public class CustomResponse {
	
	private boolean status;
	private String message;
	private Object obj;
	private List<Object> listObj;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public List<Object> getListObj() {
		return listObj;
	}
	public void setListObj(List<Object> listObj) {
		this.listObj = listObj;
	}
	
	
	public CustomResponse(boolean status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	
	public CustomResponse(boolean status, String message, Object obj) {
		super();
		this.status = status;
		this.message = message;
		this.obj = obj;
	}
	
	public CustomResponse(boolean status, String message, List<Object> listObj) {
		super();
		this.status = status;
		this.message = message;
		this.listObj = listObj;
	}
}
