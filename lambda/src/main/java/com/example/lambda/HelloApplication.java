package com.example.lambda;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {


    public static void main(String[] args) {

        MyMaxNumber max = (x,y) ->(x>=y)?x:y;

        System.out.println(max.getAMxNumnber(10,20));



    }
}