package com.example.TodoApp.repo;

import com.example.TodoApp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository interface for ToDo entity
@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long>{

}
