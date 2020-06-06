package com.restapp.demo.Services;

import org.springframework.stereotype.Service;
import sun.font.CreatedFontTracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// calling Services to make instance of Topics ((Injection / Singleton))
@Service
public class Topics {

    private List<String> myTopics = new ArrayList<>(Arrays.asList("games", "sport", "movies"));

    public List<String> showAll(){
        return myTopics;
    }

    public String getOne(String name){
        return myTopics.contains(name.toLowerCase())? name.toLowerCase() : "Not Found!";
    }

    public String addMethod(String topic){
        myTopics.add(topic);
        return "Added True";
    }

    public String update( int id , String value) {
        myTopics.set(id , value);
        return "updated !";
    }

    public String delete(int id) {
        myTopics.remove(id);
        return "deleted!" ;
    }
}
