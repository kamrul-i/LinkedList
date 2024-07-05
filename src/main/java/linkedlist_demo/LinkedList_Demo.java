package linkedlist_demo;

import java.util.LinkedList;

public class LinkedList_Demo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Afghanistan");
        linkedList.add("Pakistan");
        linkedList.add("Bangladesh");
        linkedList.add("India");
        linkedList.add("Nepel");
        
        for (String country : linkedList) {
            System.out.println(country);
        }
        //'for each loop' use করে result দেখানো হয়েছে।।
    }
}
