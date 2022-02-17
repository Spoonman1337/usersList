package lex.spring.userList.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "hello from huy");
        return mav;
    }
}
