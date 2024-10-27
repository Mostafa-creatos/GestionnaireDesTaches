package com.ENSA.Gestionnaire.des.taches.Repositories;


import com.ENSA.Gestionnaire.des.taches.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
