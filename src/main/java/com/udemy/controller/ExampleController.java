package com.udemy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.component.ExampleComponent;
import com.udemy.model.Person;
import com.udemy.service.ExampleService;

@Controller	
@RequestMapping("/example")
public class ExampleController {

	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;
	
	// Primera Forma
	@GetMapping("/exampleString")
	public String exampleString(Model model){
		exampleComponent.sayHello();
		model.addAttribute("people", exampleService.getListPeople());
		return("example");
	}
	
	
	//Segunda Forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV(){
		ModelAndView mav = new ModelAndView("example");
		mav.addObject("people", exampleService.getListPeople());
		return mav;
	}


	
	

	
}
