package com.ENSA.Gestionnaire.des.taches.Service.ServiceImpl;

import com.ENSA.Gestionnaire.des.taches.DTO.TaskDTO;
import com.ENSA.Gestionnaire.des.taches.Model.Task;
import com.ENSA.Gestionnaire.des.taches.Repositories.TaskRepository;
import com.ENSA.Gestionnaire.des.taches.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createTask(TaskDTO taskDTO) {
        Task task = new Task();
        task.setTitle(taskDTO.getTitle());
        task.setDescription(taskDTO.getDescription());
        task.setDueDate(taskDTO.getDueDate());
        taskRepository.save(task);
        return task;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    @Override
    public Task updateTask(Long id, TaskDTO taskDTO) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setTitle(taskDTO.getTitle());
        task.setDescription(taskDTO.getDescription());
        task.setDueDate(taskDTO.getDueDate());
        taskRepository.save(task);
        return task;
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
