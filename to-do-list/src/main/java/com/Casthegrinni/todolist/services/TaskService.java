package com.Casthegrinni.todolist.services;

import com.Casthegrinni.todolist.models.dtos.Task;
import com.Casthegrinni.todolist.models.dtos.TaskDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service // O service é criado uma vez só e vai se repetir em todas as classes
@SuppressWarnings("unused")
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public Task createTask(
            TaskDTO body
    ) {
        Task newTask = new Task(
                body.getTitle(),
                body.getDate(),
                body.getDescription()
        );

        tasks.add(newTask);

        return newTask;

    }
    public List<Task> getTasks() {
        return tasks;
    }

}
