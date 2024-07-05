package linkedlist_demo;

import java.util.LinkedList;

public class Student_List {

    public static void main(String[] args) {
        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।

        LinkedList<Students> studentList = new LinkedList<>();

        Students student1 = new Students(101, "Abu Ishaq");
        Students student2 = new Students(102, "Abu Raihan");
        Students student3 = new Students(103, "Tanisa Begum");
        Students student4 = new Students(104, "Sharmin Begum");
        Students student5 = new Students(105, "Abdullah Arman");
        Students student6 = new Students(106, "Abu Saleh");
        Students student7 = new Students(107, "Dilruba Begum");
        Students student8 = new Students(108, "Azhari");
        Students student9 = new Students(109, "Taha Adnan");
        Students student10 = new Students(110, "Nasima Begum");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);

        for (Students s : studentList) {
            System.out.println("ID        : " + s.id);
            System.out.println("Name      : " + s.name);
            System.out.println("ClassName : " + Students.className);
            System.out.printf("\n");

        }
    }
}
