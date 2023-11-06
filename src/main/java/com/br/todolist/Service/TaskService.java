package com.br.todolist.Service;

import com.br.todolist.model.Task;
import com.br.todolist.model.TaskEntity;
import com.br.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public String save(Task task){
        var taskEntity = new TaskEntity();
        taskEntity.setTitle(task.getTitle());
        taskEntity.setTaskDescription(task.getTaskDescription());
        var tsk = repository.save(taskEntity);
        return tsk.toString();
    }

    public Object findByTitle(String title){
        return repository.findByTitle(title);
    }

    


}
