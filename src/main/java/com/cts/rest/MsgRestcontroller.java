package com.cts.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestcontroller {
	@GetMapping("/")
	public String msg() {
		return " Hi , Bujji kanna, bujji kana,bujji kanna";
		
	}

}
