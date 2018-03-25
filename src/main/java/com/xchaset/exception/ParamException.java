package com.xchaset.exception;

public class ParamException extends RuntimeException{

    private String msg;
    
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private static final long serialVersionUID = 1L;

	public ParamException(){}

	public ParamException(String msg) {
		super();
		this.msg = msg;
	}
	
	
	
}
