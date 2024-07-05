package linkedlist_demo;
import java.util.LinkedList;
public class Student_List {

    public static void main(String[] args) {
        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।
        //--------------------------------------------------------
        LinkedList<Students> studentList1 = new LinkedList<>();
        
        Students student1 = new Students(101, "Abu Ishaq");
        Students student2 = new Students(102, "Abu Raihan");
        Students student3 = new Students(103, "Tanisa Begum");
        Students student4 = new Students(104, "Sharmin Begum");
        Students student5 = new Students(105, "Abdullah Arman");
        
        studentList1.add(student1);
        studentList1.add(student2);
        studentList1.add(student3);
        studentList1.add(student4);
        studentList1.add(student5);
        
        for (Students s : studentList1) {
            System.out.println("ID        : " + s.id);
            System.out.println("Name      : " + s.name);
            System.out.println("ClassName : " + Students.className1);
            System.out.printf("\n");
        }
        //--------------------------------------------------------
        
        
        //--------------------------------------------------------
        LinkedList<Students> studentList2 = new LinkedList<>();
        
        Students student6 = new Students(106, "Abu Saleh");
        Students student7 = new Students(107, "Dilruba Begum");
        Students student8 = new Students(108, "Azhari");
        Students student9 = new Students(109, "Taha Adnan");
        Students student10 = new Students(110, "Nasima Begum");
        
        studentList2.add(student6);
        studentList2.add(student7);
        studentList2.add(student8);
        studentList2.add(student9);
        studentList2.add(student10);        
        
        for (Students s : studentList2) {
            System.out.println("ID        : " + s.id);
            System.out.println("Name      : " + s.name);
            System.out.println("ClassName : " + Students.className2);
            System.out.printf("\n");
        }
        //--------------------------------------------------------
    }
}
