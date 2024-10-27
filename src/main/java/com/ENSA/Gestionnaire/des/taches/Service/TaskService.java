package com.ENSA.Gestionnaire.des.taches.Service;

import com.ENSA.Gestionnaire.des.taches.DTO.TaskDTO;
import com.ENSA.Gestionnaire.des.taches.Model.Task;

import java.util.List;

public interface TaskService {
    Task createTask(TaskDTO taskDTO);
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task updateTask(Long id, TaskDTO taskDTO);
    void deleteTask(Long id);
}
