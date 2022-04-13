package com.company.view;

import com.company.controller.ClassRoomController;
import com.company.model.ClassRoom;
import com.company.service.classroom.ClassRoomServiceIMPL;

import java.util.List;
import java.util.Scanner;

public class ClassRoomView {
    Scanner scanner = new Scanner(System.in);
    ClassRoomController classRoomController = new ClassRoomController();
    List<ClassRoom> classRoomList = ClassRoomServiceIMPL.classRooms;
    public void formCreateClassRoom(){
        while (true){
            int id;
            if(classRoomList.size()==0){
                id = 1;
            } else {
               id =  classRoomList.get(classRoomList.size()-1).getId()+1;
            }
            System.out.println("Enter the name class room: ");
            String name = scanner.nextLine();
            ClassRoom classRoom = new ClassRoom(id,name);
            classRoomController.createClassRoom(classRoom);
            System.out.println("Enter any key to continue create ClassRoom or Enter QUIT to come back menu: ");
            String backMenu = scanner.nextLine();
            if(backMenu.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
    public void formListClassRoom(){
        System.out.println(classRoomController.showListClassRoom());
        System.out.println("Enter QUIT to come back menu: ");
        String backMenu = scanner.nextLine();
        if(backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
