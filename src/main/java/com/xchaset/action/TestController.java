package com.xchaset.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.xchaset.dto.BaseResponseDTO;
import com.xchaset.exception.ParamException;
import com.xchaset.util.IOUtil;
import com.xchaset.vo.ClassVO;

@RestController
public class TestController {
	
	private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

	@PostMapping("/upload")
	public BaseResponseDTO<String> uploadFile(@RequestParam("files") MultipartFile [] files){
		BaseResponseDTO<String> baseRes = new BaseResponseDTO<>();
		for (MultipartFile multipartFile : files) {
			String fileName = multipartFile.getOriginalFilename();
			//String fileType = fileName.substring(fileName.lastIndexOf("."));
			OutputStream os = null;
			InputStream in = null;
			try {
				try{
					in = multipartFile.getInputStream();
					byte [] result = IOUtil.readBytes(in);
					os = new FileOutputStream(new File("C:\\Users\\xiaozhaoming\\Desktop\\"+fileName));
					os.write(result);
					os.flush();
					}finally {
						os.close();
					}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		baseRes.setCode("000000");
		baseRes.setMsg("sucess");
		return baseRes;
	}
	
	@PostMapping("/test")
	public BaseResponseDTO<String> test(@Valid @RequestBody ClassVO classVo,BindingResult result)
	{
		if(result.hasErrors()){//如果有错误就抛出异常，交给ExceptionHandler处理，提示xx参数错误
			ObjectError error = result.getAllErrors().get(0);
			throw new ParamException(error.getDefaultMessage());
		}
		BaseResponseDTO<String> base = new BaseResponseDTO<>();
		base.setCode("000000");
		base.setMsg("sucess");
		base.setData("xxx");
		return base;
	}
	
	
	public ResponseEntity test2(){
		ResponseEntity<BaseResponseDTO<String>> res = new ResponseEntity<>(HttpStatus.OK);
	
		return res;
	}
}
