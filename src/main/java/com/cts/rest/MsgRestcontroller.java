package com.cts.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestcontroller {
	@GetMapping("/")
	public String msg() {
		return " Your going to meet 30 ruppes chicken,Your most Luckiest Person";
		
	}

}
