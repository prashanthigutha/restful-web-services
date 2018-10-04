package com.in28minutes.rest.webservices.restfulwebservices;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	
	@GetMapping(path="/hello-world")
	public String helloWorld(){
		
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorld helloWorldBean(){
		
		return new HelloWorld("Hello Prashanthi");
	}
	
	
	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public HelloWorld helloWorldPathVariable(@PathVariable String name){
		
		return new HelloWorld(String.format("Hello Prashanthi,%s",name));
	}
	
	
}
