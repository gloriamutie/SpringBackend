package com.Gloria.demo.repository;

import com.Gloria.demo.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository  extends MongoRepository<ToDo,String>{

}
