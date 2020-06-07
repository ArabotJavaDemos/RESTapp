package com.restapp.demo.Data;
import org.springframework.data.repository.CrudRepository;

//  to use all the crud operators.
public interface TopicRepo extends CrudRepository<Topics , String> {
}
