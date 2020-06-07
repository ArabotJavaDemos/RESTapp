package com.restapp.demo.Services;

import com.restapp.demo.Data.Topics;
import org.springframework.stereotype.Service;
import sun.font.CreatedFontTracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// calling Services to make instance of Topics ((Injection / Singleton))
@Service
public class TopicServices {

    private List<Topics> myTopics = new ArrayList<>(Arrays.asList(
            new Topics("ahmad" , "22" , "game"),
            new Topics("ali" , "32" , "movies"),
            new Topics("danial" , "12" , "reading")
    ));


    public List<Topics> showAll(){
        return myTopics;
    }

    public String getOne(String name){
        return myTopics.contains(name.toLowerCase())? name.toLowerCase() : "Not Found!";
    }

    public String addMethod(Topics topic){
        myTopics.add(topic);
        return "Added True";
    }

    public String update( int id , Topics value) {
        myTopics.set(id , value);
        return "updated !";
    }

    public String delete(int id) {
        myTopics.remove(id);
        return "deleted!" ;
    }
}
