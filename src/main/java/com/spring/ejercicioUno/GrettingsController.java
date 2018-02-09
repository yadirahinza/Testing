package com.spring.ejercicioUno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GrettingsController {
	
	@RequestMapping(value="/grettings.do")
	public String Hello(){
		return "pagaGrettings";
	}
}
