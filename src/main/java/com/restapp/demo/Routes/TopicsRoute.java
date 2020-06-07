package com.restapp.demo.Routes;

import com.restapp.demo.Data.Topics;
import com.restapp.demo.Services.TopicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<Topics> getName(@PathVariable String name){
        return service.getOne(name);
    }

    //post request
    @PostMapping("/topics")
    public Topics postMethod(@RequestBody Topics data){
        return service.addMethod(data);
    }

    //put request
    @PutMapping("/topics/{id}")
    public Topics update(@PathVariable String id , @RequestBody Topics data){
        return service.update(id , data) ;
    }

    // delete Request
    @DeleteMapping("/topics/{id}")
    public String delete(@PathVariable String id){
        service.delete(id);
        return "done";
    }
}
