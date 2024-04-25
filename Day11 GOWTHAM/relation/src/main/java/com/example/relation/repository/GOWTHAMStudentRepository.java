package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.GOWTHAMStudent;

@SuppressWarnings("unused")
@Repository
public interface GOWTHAMStudentRepository<Student> extends JpaRepository<Student,Integer>{
    
}
