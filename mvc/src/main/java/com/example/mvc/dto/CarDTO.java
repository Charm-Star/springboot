package com.example.mvc.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {

    private String carName;

    @JsonProperty("car-number")
    private String carNumber;

}
