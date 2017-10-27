package net.nonego.blog.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import net.nonego.blog.result.ErrorEnum;
import net.nonego.blog.result.Result;

@ControllerAdvice
public class BlogExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(BlogExceptionHandler.class);
	@ExceptionHandler
	@ResponseBody
	public Result<Object> handle(Exception e) {
		logger.error("error occured", e);
		return new Result<Object>(ErrorEnum.UNKNOW_ERROR, null);
	}
}
