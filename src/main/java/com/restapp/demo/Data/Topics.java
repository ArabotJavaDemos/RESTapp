package com.restapp.demo.Data;
import javax.persistence.Entity;
import javax.persistence.Id;


// to create a table
@Entity
public class Topics {

    @Id
    private String name ;
    private String age ;
    private String fav;

    public Topics(String name, String age, String fav) {
        this.name = name;
        this.age = age;
        this.fav = fav;
    }

    public Topics(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFav() {
        return fav;
    }

    public void setFav(String fav) {
        this.fav = fav;
    }
}
