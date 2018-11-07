package com.xchaset.exceptionhandle;

import javax.validation.ConstraintDeclarationException;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.xchaset.dto.BaseResponseDTO;
import com.xchaset.exception.ParamException;

@RestControllerAdvice
public class DealException {

	
	private static final Logger LOG = LoggerFactory.getLogger(DealException.class);
	@ExceptionHandler(ParamException.class)
	public BaseResponseDTO<String> deal(ParamException paramException){
		LOG.info("异常："+ paramException.toString());
		BaseResponseDTO<String> base = new BaseResponseDTO<>();
		base.setCode("000002");
		base.setData(paramException.getMsg());
		base.setMsg("incorrect param");
		return base;
	}
}
