package com.mysite.bokyung;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/bokyung")
	@ResponseBody
	public String index() {
		//System.out.println("index");
		return "안녕하세요 bokyung에 오신것 환영합니다";
	}
	
	
	@RequestMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}
