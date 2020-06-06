package com.restapp.demo.Routes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// using REST controller will be sure to use JSON format.
@RestController
public class MainRoute {

        @GetMapping()
        public String mainRes(){
            return "First Server Alive !!";
        }

    }


