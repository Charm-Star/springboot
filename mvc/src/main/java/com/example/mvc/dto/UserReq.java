package com.example.mvc.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserReq {
    private String name ;
    private int age ;
    private String email;
    @JsonProperty("phone-number")
    private String phoneNumber;
}
