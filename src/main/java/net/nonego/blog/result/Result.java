package net.nonego.blog.result;

public class Result<T> {
	private ErrorEnum code;
	private T data;

	public Result(ErrorEnum code, T data) {
		this.code = code;
		this.data = data;
	}
	
	public ErrorEnum getCode() {
		return code;
	}

	public void setCode(ErrorEnum errorEnum) {
		this.code = errorEnum;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
