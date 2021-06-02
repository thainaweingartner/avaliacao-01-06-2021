package com.avaliacao.avaliacao.Task;

import com.avaliacao.avaliacao.Client.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByClient(Client client);
}
