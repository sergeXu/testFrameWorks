package cn.serge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sergexu on 2017/5/15.
 */
@Controller
public class testPageController {
    @RequestMapping(value="/test")
    public String testFun(Model model)
    {
        model.addAttribute("message","Hello test world");
        return "testPage";
    }
}
