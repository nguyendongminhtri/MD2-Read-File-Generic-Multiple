package com.company.controller;

import com.company.model.ClassRoom;
import com.company.model.Student;
import com.company.service.classroom.ClassRoomServiceIMPL;
import com.company.service.student.StudentServiceIMPL;

import java.util.List;

public class StudentController {
    StudentServiceIMPL studentServiceIMPL = new StudentServiceIMPL();
    public List<Student> showListClassRoom(){
        return studentServiceIMPL.findAll();
    }
    public void createStudent(Student student){
        studentServiceIMPL.save(student);
    }
}
