package com.example.mvc.controller;


import com.example.mvc.dto.PostDTO;
import com.example.mvc.dto.UserReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/post")
public class PostController {



    @PostMapping("/post-req")
    public void post(@RequestBody Map<String,Object> requestData){
        requestData.entrySet().forEach(entry ->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
    }

    @PostMapping("/post-req/dto")
    public void postDto(@RequestBody UserReq userReq){
        System.out.println(userReq.toString());
    }


    @PostMapping("/post-req/carDTO")
    public PostDTO carDto(@RequestBody PostDTO postDTO){
        System.out.println(postDTO.toString());
        return postDTO;
    }
}
