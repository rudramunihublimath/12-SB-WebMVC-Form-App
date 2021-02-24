package com.io.SBWebMVCFormApp.controller;

import com.io.SBWebMVCFormApp.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/v2")
public class UserNewController {
    @GetMapping("/loadformNEW")
    public String loadUserForm(){
        return "index";
    }


    @PostMapping("/saveuser")
    public String handleSubmitBtn(User user, Model model){
        System.out.println(user);
        model.addAttribute("msg","user saved successfully..");
        return "success";
    }


}
