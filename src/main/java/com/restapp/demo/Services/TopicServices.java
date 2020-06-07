package com.restapp.demo.Services;

import com.restapp.demo.Data.TopicRepo;
import com.restapp.demo.Data.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


// calling Services to make instance of Topics ((Injection / Singleton))
@Service
public class TopicServices {

    @Autowired
    private TopicRepo topicRepo ;


    public List<Topics> showAll(){
        List<Topics> result = new ArrayList<>();

        // using java reference
        topicRepo.findAll().forEach(result::add);
        return result ;
    }


    public Optional<Topics> getOne(String name){
//        return myTopics.contains(name.toLowerCase())? name.toLowerCase() : "Not Found!";
        return topicRepo.findById(name);
    }

    public Topics addMethod(Topics topic){
        return topicRepo.save(topic); //returned the saved entity;
    }

    public Topics update( String id , Topics value) {
        return topicRepo.save(value);
    }

    public void delete(String id) {
        topicRepo.deleteById(id);
    }
}
