package com.Casthegrinni.todolist.controllers;


import com.Casthegrinni.todolist.models.dtos.Task;
import com.Casthegrinni.todolist.models.dtos.TaskDTO;
import com.Casthegrinni.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SuppressWarnings("unused")
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task createTask(
            @RequestBody TaskDTO body
    ) {
        return taskService.createTask(body);
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

}
