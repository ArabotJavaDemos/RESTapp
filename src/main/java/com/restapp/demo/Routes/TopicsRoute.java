package com.restapp.demo.Routes;

import com.restapp.demo.Data.Topics;
import com.restapp.demo.Services.TopicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicsRoute {

    // to connect it with the service ;
    @Autowired
    private TopicServices service;

    @GetMapping("/topics")
    public List<Topics> showTopics(){
        return service.showAll();
    }

    // using prams
    @GetMapping("/topics/{name}")
    public String getName(@PathVariable String name){
        return service.getOne(name);
    }

    //post request
    @PostMapping("/topics")
    public String postMethod(@RequestBody Topics data){
        System.out.println("@@@@@@@@@@@@");
        System.out.println(data);
        return service.addMethod(data);
    }

    //put request
    @PutMapping("/topics/{id}")
    public String update(@PathVariable int id , @RequestBody Topics data){
        return service.update(id , data) ;
    }

    // delete Request
    @DeleteMapping("/topics/{id}")
    public String delete(@PathVariable int id){
        return service.delete(id);
    }
}
