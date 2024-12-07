package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {

	@GetMapping("greet")
	public ModelAndView greet(@RequestParam("username") String name) {
		ModelAndView mv = new ModelAndView("greet");
		System.out.println(name);
		mv.addObject("name", name);
		return mv;
	}

	@GetMapping("about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("about");
		return mv;
	}

	@GetMapping("demo1")
	public ModelAndView demo1(@RequestParam("age") double age, @RequestParam("country") String country) {
		ModelAndView mv = new ModelAndView("demo1");
		mv.addObject("age", age);
		mv.addObject("country", country);
		return mv;
	}

	@GetMapping("demo2/{a}/{b}")
	public ModelAndView demo2(@PathVariable("a") double a, @PathVariable("b") double b) {
		ModelAndView mv = new ModelAndView("demo2");
		double subResult = a - b;
		double divisonResult = a % b;
		mv.addObject("subtraction", subResult);
		mv.addObject("divison", divisonResult);
		return mv;
	}

	@GetMapping("productform")
	public ModelAndView productform() {
		ModelAndView mv = new ModelAndView("productform");
		return mv;
	}

	@GetMapping("multiplyNumbers")
	public ModelAndView multiplyNumbers(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
		ModelAndView mv = new ModelAndView("multiplyNumbers");
		double multiplicationResult = num1 * num2;
		mv.addObject("multiplicationResult", multiplicationResult);
		return mv;
	}

	@GetMapping("reverse")
	public ModelAndView reverse(@RequestParam("str1") String str1, @RequestParam("str2") String str2) {
		ModelAndView mv = new ModelAndView("reverse");
		String reversedString1 = "";
		String reversedString2 = "";
		char ch1;
		char ch2;
		for (int i = 0; i < str1.length(); i++) {

			ch1 = str1.charAt(i);

			reversedString1 = ch1 + reversedString1;
		}
		for (int i = 0; i < str2.length(); i++) {

			ch2 = str2.charAt(i);

			reversedString2 = ch2 + reversedString2;
		}
		mv.addObject("str1", reversedString1);
		mv.addObject("str2", reversedString2);
		return mv;
	}

	@GetMapping("calculate")
	public ModelAndView calculate(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
		ModelAndView mv = new ModelAndView("calculate");
		double subtractionResult = num1 - num2;
		double additionResult = num1 + num2;
		mv.addObject("subtractionResult", subtractionResult);
		mv.addObject("additionResult", additionResult);
		return mv;
	}

}
