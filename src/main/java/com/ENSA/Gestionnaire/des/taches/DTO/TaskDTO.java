package com.ENSA.Gestionnaire.des.taches.DTO;

import lombok.Data;
import java.time.LocalDate;

@Data
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private String status;
}