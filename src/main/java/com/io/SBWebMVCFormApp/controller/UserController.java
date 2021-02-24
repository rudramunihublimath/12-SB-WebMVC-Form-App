package com.io.SBWebMVCFormApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @GetMapping("/loadform")
    public String loadUserForm(){
        return "index";
    }

    @PostMapping("/saveuser")
    public String handleSubmitBtn(HttpServletRequest req, Model model){
         String uid=req.getParameter("uid");
         String uname=req.getParameter("uname");
         String uphn=req.getParameter("uphn");

        System.out.println(uid);
        System.out.println(uname);
        System.out.println(uphn);

        model.addAttribute("msg","user saved successfully..");
        return "success";
    }


}
