package com.avaliacao.avaliacao.Task;

import com.avaliacao.avaliacao.Client.Client;
import com.avaliacao.avaliacao.Client.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ClientService clientService;

    public Task save(Long clientId, Task task){
        Client client = clientService.findById(clientId);
        task.setClient(client);
        return taskRepository.save(task);
    }

    public List<Task> findTaskByClient(Long clientId){
        Client client = clientService.findById(clientId);
        List<Task> tasks = taskRepository.findByClient(client);
        return tasks;
    }
}