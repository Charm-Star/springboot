package com.example.mvc.controller;

import com.example.mvc.dto.UserReq;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")    // http://localhost:8080/api/get/hello
    public String getHello(){
        return "get Hello";
    }
    @RequestMapping(path = "/hi",method = RequestMethod.GET) // http://localhost:8080/api/get/hi
    public  String hi(){
        return "hi";
    }


    @GetMapping("/path-variable/{name}")  // 주소에는 대문자를 쓰지 않는다 // http://localhost:8080/api/get/path-variable/{name}
    public String pathVariable(@PathVariable(name = "name") String pathName){
        System.out.println(pathName);
        return pathName;

    }
    @GetMapping("/query-param")                 //http://localhost:8080/api/get/query-param?name=java&age=20
    public String queryParam(@RequestParam Map<String , String> queryParam){

        StringBuffer sb = new StringBuffer();

        queryParam.entrySet().forEach(entry ->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("|n");

            sb.append(entry.getKey()+"="+entry.getValue());



        });
        return sb.toString();
    }

    @GetMapping("/query-param02") ////http://localhost:8080/api/get/query-param?name=java&age=20&email=abcd@gamil.com
    public String queryParam02(
            @RequestParam String name,
            @RequestParam int age,
            @RequestParam String email
    ){


        System.out.println(name+" "+age+" "+email);


        return name+" "+age+" "+email;
    }


    @GetMapping("/query-param03")
    public String queryParam03(UserReq userReq){  //


        System.out.println(userReq.getName()+" "+userReq.getEmail()+" "+userReq.getAge());


        return userReq.toString();
    }
}
