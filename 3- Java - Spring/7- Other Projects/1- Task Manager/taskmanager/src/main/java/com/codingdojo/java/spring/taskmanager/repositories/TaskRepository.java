package com.codingdojo.java.spring.taskmanager.repositories;


import java.util.List;

import com.codingdojo.java.spring.taskmanager.models.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findAll();

    @Query(value="SELECT * FROM tasks ORDER BY Priority ASC", nativeQuery=true)
    List<Task> findAllPriorityLowToHigh();
    @Query(value="SELECT * FROM tasks ORDER BY Priority DESC", nativeQuery=true)
    List<Task> findAllPriorityHighToLow();

}
