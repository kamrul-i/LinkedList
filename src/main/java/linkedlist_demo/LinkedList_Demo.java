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
        
        System.out.println(linkedList);
    }
    
    /*
    ArrayList and LinkedList are same, but their data store is different
    ArrayList এর size নির্দিষ্ট করে দেওয়া যায়, তবে LinkedLst এর size নির্দিষ্ট করে দেওয়া যায় না।।

    Difference between arraylist and linkedlist----------------
    
    ArrayList----------
    ArrayList class uses a dynamic array for storing the elements.
    ArrayList is better for sorting and accessing data.
    ArrayList is slow for manipulating data (deleting or inserting data).
    ArrayList can contain duplicate elements.
    
    LinkedLst----------
    LinkedList_Demo class uses doubly linked_list to store the elements.
    manipulating of data is fast here (deleting or inserting data).
    LinkedList_Demo can contain duplicate elements.
    LinkedList null দ্বারা শুরু হয়, এবং null দ্বারা শেষ হয়।।
    
    */
}
