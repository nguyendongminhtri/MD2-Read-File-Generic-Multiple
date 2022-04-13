package com.company.service.classroom;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.ClassRoom;

import java.util.List;

public class ClassRoomServiceIMPL implements IClassRoomService {
    public static String PATH = "E:\\CODEGYM\\C0222I1\\GenericBynaryFile\\src\\com\\company\\data\\classRoom.txt";
    public static List<ClassRoom> classRooms = new ConfigReadAndWriteFile<ClassRoom>().readFromFile(PATH);

    @Override
    public List<ClassRoom> findAll() {
        new ConfigReadAndWriteFile<ClassRoom>().writeToFile(PATH, classRooms);
        return classRooms;
    }

    @Override
    public void save(ClassRoom classRoom) {
        classRooms.add(classRoom);
    }

    @Override
    public ClassRoom findById(int id) {
        for (int i = 0; i < classRooms.size(); i++) {
            if(id==classRooms.get(i).getId()){
                return classRooms.get(i);
            }
        }
        return null;
    }
}
