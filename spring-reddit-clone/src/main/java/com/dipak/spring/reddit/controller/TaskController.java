package com.dipak.spring.reddit.controller;

package com.codility.rest;

import com.codility.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskRepository repository;

    @Autowired
    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Long> create(@RequestBody TaskDto taskDto) {
        Task task = prepareTaskFromTaskDto(taskDto);
        repository.save(task);
        return ResponseEntity.ok(task.getId());
    }



    


    private Task prepareTaskFromTaskDto (TaskDto taskDto) {
        Task task = new Task(taskDto.getTitle());
        task.setDescription(taskDto.getDescription());
        return task;
    }

}
