package cn.serge.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cn.serge.domain.User;
import cn.serge.service.UserService;

@Controller
public class UserController {
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping(value="/login")
	public ModelAndView login(String loginname,String password,ModelAndView mv,HttpSession session)
	{
		System.out.println("****** ִ�е�½���� ******");
		User user = userService.login(loginname, password);
		System.out.println(user==null?"���û�":user.toString());
		if(user!=null)
		{
			session.setAttribute("user", user);
			mv.setView(new RedirectView("main"));
			
		}else {
			mv.addObject("message", "��¼���������������������");
			mv.setViewName("loginForm");;
		}
		System.out.println(mv.toString());
		return mv;
	}
}
