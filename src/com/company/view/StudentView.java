package com.company.view;

import com.company.controller.ClassRoomController;
import com.company.controller.StudentController;
import com.company.model.ClassRoom;
import com.company.model.Student;
import com.company.service.student.StudentServiceIMPL;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();
    ClassRoomController classRoomController = new ClassRoomController();
    List<Student> studentList = StudentServiceIMPL.studentList;
    public StudentView()  {
    }
    public void showListStudent()  {
        System.out.println(studentController.showListClassRoom());
        System.out.println("Enter QUIT to come back menu: ");
        String backMenu = scanner.nextLine();
        if(backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void createStudent()  {
        while (true){
            int id;
            if(StudentServiceIMPL.studentList.size()==0){
                id = 1;
            } else {
                id = studentList.get(studentList.size()-1).getId()+1;
            }
            System.out.println("Enter the name Student: ");
            String name = scanner.nextLine();
            System.out.println("Enter the age Student: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the id Class Room: ");
            int idClass = Integer.parseInt(scanner.nextLine());
            ClassRoom classRoom = classRoomController.findById(idClass);
            Student student = new Student(id,name,age,classRoom);
            studentController.createStudent(student);
            System.out.println("Enter any key to continue create Student or Enter QUIT to come back menu: ");
            String backMenu = scanner.nextLine();
            if(backMenu.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
}
