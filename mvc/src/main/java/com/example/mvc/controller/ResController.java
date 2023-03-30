package com.example.mvc.controller;


import com.example.mvc.dto.UserReq;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/res")
public class ResController {

    @GetMapping("/text")
    public String text(@RequestParam String text){
        return text;

    }

    @PostMapping("/json")
    public UserReq json(@RequestBody UserReq userReq){

        return userReq; //200 ok
    }

    @PutMapping("/put")
    public ResponseEntity<UserReq> put(@RequestBody UserReq userReq){
        return ResponseEntity.status(HttpStatus.CREATED).body(userReq);

    }



}
