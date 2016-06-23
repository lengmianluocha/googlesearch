package com.hf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hf.service.HttpRequest;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
		model.addAttribute("name", name);
		// returns the view name
		return "helloworld";
	}
	
	@RequestMapping("/google")
	public String google(Model model) {
		String url = "https://www.googleapis.com/customsearch/v1?key=AIzaSyAvN8sG57xkxxehdkqxTug78Sb9N1AX8Xk&cx=015809735721665758767:pn5vj3uq8qi&q=china";
		String str = HttpRequest.sendGet(url, null);
		model.addAttribute("name", str);
		// returns the view name
		return "helloworld";
	}
}
