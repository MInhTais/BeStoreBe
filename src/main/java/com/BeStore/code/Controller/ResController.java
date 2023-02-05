package com.BeStore.code.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ResController {
	 @GetMapping(value = {"/", "/home"})
	    public String homepage() {
	        return "home"; // Trả về home.html
	    }

	    @GetMapping("/hello")
	    public String hello() {
	        return "hello"; // Trả về hello.html
	    }
}
