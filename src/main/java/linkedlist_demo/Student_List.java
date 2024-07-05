package linkedlist_demo;

import java.util.LinkedList;

public class Student_List {

    public static void main(String[] args) {
        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।

        LinkedList<Students> studentList = new LinkedList<>();

        Students student1 = new Students(101, "Abu Ishaq","     one");
        Students student2 = new Students(102, "Abu Raihan","    eleven");
        Students student3 = new Students(103, "Tanisa Begum","  two");
        Students student4 = new Students(104, "Sharmin Begum"," three");
        Students student5 = new Students(105, "Abdullah Arman","four");
        Students student6 = new Students(106, "Abu Saleh","     five");
        Students student7 = new Students(107, "Dilruba Begum"," six");
        Students student8 = new Students(108, "Azhari","        eight");
        Students student9 = new Students(109, "Taha Adnan","    ten");
        Students student10 = new Students(110, "Nasima Begum"," twelve");

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
            System.out.println(s.id + ", " + s.name + ", " + s.className);

        }
    }
}
