package com.amanuel.springboot.firstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello, this is Spring!!";
	}
	
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		
		 
		 StringBuffer sb=new StringBuffer();
		 sb.append("<html>");
		 sb.append("<head>");
		 sb.append("<title>");
		 sb.append("My First webpage");
		 sb.append("</title>");
		 sb.append("<body>");
		 sb.append("<h1>");
		 sb.append("This is my first spring app");
		 sb.append("</h1>");
		 sb.append("</body>");
//		 sb.append("/html");
		 
		 return sb.toString();
		
	}
	
	
	
	
	@RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
		return "sayHello";
	}
	
	//login 
	
//	@RequestMapping("login")
//	public String login(){
//		return "login";
//	}
	
	
	

}
