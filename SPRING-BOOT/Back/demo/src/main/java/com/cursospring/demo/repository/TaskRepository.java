package com.cursospring.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cursospring.demo.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
    @Query(value = "SELECT description FROM task INNER JOIN users ON task.user_id = users.id WHERE task.user_id = :UserId", nativeQuery = true)
    List<Task> findByUser_id(@Param("UserId") Long UserId);
}
