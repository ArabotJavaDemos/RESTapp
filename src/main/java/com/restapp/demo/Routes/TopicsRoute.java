package com.restapp.demo.Routes;

import com.restapp.demo.Services.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicsRoute {

    // to connect it with the service ;
    @Autowired
    private Topics topics;

    @GetMapping("/topics")
    public List<String> showTopics(){
        return topics.showAll();
    }

    // using prams
    @GetMapping("/topics/{name}")
    public String getName(@PathVariable String name){
        return topics.getOne(name);
    }

    //post request
    @PostMapping("/topics")
    public String postMethod(@RequestBody String data){
        System.out.println("@@@@@@@@@@@@");
        System.out.println(data);
        return topics.addMethod(data);
    }

    //put request
    @PutMapping("/topics/{id}")
    public String update(@PathVariable int id , @RequestBody String data){
        return topics.update(id , data) ;
    }

    // delete Request
    @DeleteMapping("/topics/{id}")
    public String delete(@PathVariable int id){
        return topics.delete(id);
    }
}
