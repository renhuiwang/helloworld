package com.service.helloworld.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-24T04:30:22.917Z")

@RestSchema(schemaId = "helloworld")
@RequestMapping(path = "/helloworld", produces = MediaType.APPLICATION_JSON)
public class HelloworldImpl {

    @Autowired
    private HelloworldDelegate userHelloworldDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHelloworldDelegate.helloworld(name);
    }

}
