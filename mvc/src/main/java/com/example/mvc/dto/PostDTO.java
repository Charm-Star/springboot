package com.example.mvc.dto;


import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {

    private String name;
    private int age;

    private List<CarDTO> carList;
}
