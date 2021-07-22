package com.Casthegrinni.todolist.controllers;

import com.Casthegrinni.todolist.models.dtos.Task;
import com.Casthegrinni.todolist.models.dtos.TaskDTO;
import com.Casthegrinni.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping("/{id}")
    public Task getTaskById(
            @PathVariable UUID id
    ) {
        return taskService.getTaskById(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTaskById(
            @PathVariable UUID id
    ) {
        return taskService.deleteTaskById(id);
    }

    @PutMapping("/{id}")
    public Task updateTask(
            @PathVariable UUID id,
            @RequestBody TaskDTO body
    ) {
        return taskService.updateTask(id, body);
    }


}
