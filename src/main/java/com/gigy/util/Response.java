package com.gigy.util;

import org.springframework.stereotype.Component;

@Component
public class Response {

	private String code;
	private Object data;
	
	public Response() {}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
