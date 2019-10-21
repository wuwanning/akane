package cn.mikulove.akane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("/show")
    public String show(Model model){
        model.addAttribute("msg", "thymelear入门案例");
        return "admin/index";
    }

}
