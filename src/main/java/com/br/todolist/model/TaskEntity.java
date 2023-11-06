package com.br.todolist.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Task")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "task_description")
    private String taskDescription;

}
