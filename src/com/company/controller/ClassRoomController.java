package com.company.controller;

import com.company.model.ClassRoom;
import com.company.service.classroom.ClassRoomServiceIMPL;

import java.util.List;

public class ClassRoomController {
    ClassRoomServiceIMPL classRoomServiceIMPL = new ClassRoomServiceIMPL();
    public List<ClassRoom> showListClassRoom(){
        return classRoomServiceIMPL.findAll();
    }
    public void createClassRoom(ClassRoom classRoom){
        classRoomServiceIMPL.save(classRoom);
    }
    public ClassRoom findById(int id){
        return classRoomServiceIMPL.findById(id);
    }
}
