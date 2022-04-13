package com.company.view;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
public Main(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("====================STUDENT MANAGE===================");
    System.out.println("1. CREATE CLASSROOM");
    System.out.println("2. SHOW LIST CLASS ROOM");
    System.out.println("3. CREATE STUDENT");
    System.out.println("4. SHOW LIST STUDENT");
    int chooseMenu = scanner.nextInt();
    switch (chooseMenu){
        case 1:
            new ClassRoomView().formCreateClassRoom();
            break;
        case 2:
            new ClassRoomView().formListClassRoom();
            break;
        case 3:
            new StudentView().createStudent();
            break;
        case 4:
            new StudentView().showListStudent();
    }
}
    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
