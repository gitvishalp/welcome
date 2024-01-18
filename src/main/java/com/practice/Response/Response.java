package com.practice.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response<T> {
	
	@JsonProperty("Status")
	private int statusCode;
	@JsonProperty("Message")
	private String message;
	@JsonProperty("Data")
	private T data;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Response(int statusCode, String message, T data) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.data = data;
	}
	public Response(int statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}
}
