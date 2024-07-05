package linkedlist_demo;

import java.util.LinkedList;

public class LinkedList_Demo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Afghanistan");
        linkedList.add("Pakistan");
        linkedList.add("India");
        linkedList.add("UK");
        linkedList.add("USA");
        linkedList.add("UAE");
        linkedList.add("Sri Lanka");
        linkedList.add("India");
        linkedList.add("Maldives");
        linkedList.add("Nepel");
        
        linkedList.add(2,"Saudi Arabia"); //একটি element-কে কততম size-এ দেখানো হবে, তা নির্দিষ্ট করে দেওয়া যায়।।
        linkedList.addFirst("Bangladesh");//এর মানে এই index কে সবার উপরে দেখাও
        linkedList.addLast("Japan");      //এর মানে এই index কে সবার নিচে দেখাও     
        
        linkedList.remove("Japan");       //এর মানে এই নির্দিষ্ট index কে remove কর
        linkedList.remove(8);             //এর মানে এতো number index কে remove কর
        linkedList.removeFirst();         //এর মানে প্রথম index কে remove কর
        linkedList.removeLast();          //এর মানে শেষ index কে remove কর        
                
        //'for each loop' use করে result দেখানো হয়েছে।।
        for (String country : linkedList) {
            System.out.println(country);
        }
        System.out.println("Size of the Linked_List : " + linkedList.size());

    }
}
