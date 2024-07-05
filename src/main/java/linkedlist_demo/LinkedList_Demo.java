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
        linkedList.add(2,"Saudi Arabia"); //একটি element-কে কততম size-এ দেখানো হবে, তা নির্দিষ্ট করে দেওয়া যায়।।

        //'for each loop' use করে result দেখানো হয়েছে।।
        for (String country : linkedList) {
            System.out.println(country);
        }
        System.out.println("Size of the Linked_List : " + linkedList.size());

    }
}
