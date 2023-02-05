package com.BeStore.code.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ResponseController {
	@ResponseBody
	@GetMapping("/s")
	public String GetBody() {
		return "ResponseBody";
	}

}
