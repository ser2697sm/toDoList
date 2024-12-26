package com.toDoList.task.controller;

import com.toDoList.task.entity.Task;
import com.toDoList.task.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/api/task/")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/alltask")
    public ResponseEntity<?> allTask() {
        return ResponseEntity.ok(taskService.allTask());
    }

    @GetMapping("/task/{id}")
    public ResponseEntity<?> searchByIdTask(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.findById(id));
    }

    @PostMapping("/createTask")
    public ResponseEntity<?> createTask(@RequestBody Task task) {
        return ResponseEntity.ok(taskService.createTask(task));
    }

    @DeleteMapping("/deleteTask")
    public void deleteTask(@PathVariable Long id) {
      taskService.deleteTask(id);
    }


}
