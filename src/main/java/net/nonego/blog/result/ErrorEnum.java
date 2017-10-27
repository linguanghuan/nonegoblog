package net.nonego.blog.result;

public enum ErrorEnum {
	OK(0, "success"),
	UNKNOW_ERROR(400, "unknow error"),
	ERROR(404, "resource not found")
	;
	
	private int errorCode;
	private String errorMsg;
	private ErrorEnum(int code, String errorMsg) {
		this.errorCode = code;
		this.errorMsg = errorMsg;
	}
	
	public int getErrorCode() {
		return this.errorCode;
	}
	public String getErrorMsg() {
		return this.errorMsg;
	}
}
