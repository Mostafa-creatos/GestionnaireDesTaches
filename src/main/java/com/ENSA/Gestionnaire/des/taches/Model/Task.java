package com.ENSA.Gestionnaire.des.taches.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    public Task() {
        this.status = TaskStatus.TODO;
    }
}