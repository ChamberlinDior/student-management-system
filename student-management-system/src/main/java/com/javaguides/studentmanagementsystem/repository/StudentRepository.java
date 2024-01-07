package com.javaguides.studentmanagementsystem.repository;


import com.javaguides.studentmanagementsystem.entity.Student;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
