package cn.serge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	@RequestMapping(value="/{formname}")
	public String LoginForm(@PathVariable String formname)
	{
		return formname;
	}
}
