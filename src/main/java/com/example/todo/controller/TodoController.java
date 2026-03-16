package com.example.todo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

//    private final TodoRepository repository;

//    public TodoController(TodoRepository repository) {
//        this.repository = repository;
//    }

    @GetMapping
    public List<String> getTodos() {
        return List.of("Java勉強", "Angular勉強");
    }

//    @GetMapping
//    public List<Todo> getTodos() {
//        return repository.findAll();
//    }
}
