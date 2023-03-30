package com.example.mvc.controller;

import com.example.mvc.dto.UserReq;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public UserReq user(){
        var user = new UserReq();
        user.setAge(20);
        user.setName("임규진");
        user.setEmail("zxzx05050@naver.com");
        return user;


    }


}
