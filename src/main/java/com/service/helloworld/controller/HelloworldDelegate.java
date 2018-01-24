package com.service.helloworld.controller;

import org.springframework.stereotype.Component;


@Component
public class HelloworldDelegate {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
