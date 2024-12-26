package com.toDoList.task.service;

import com.toDoList.task.entity.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {

     List<Task> allTask();

     Optional<Task> findById(Long id);

     Task createTask(Task task);

     void deleteTask(Long id);

}
