package com.br.todolist.repository;

import com.br.todolist.model.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
    TaskEntity findByTitle(String title);
}
