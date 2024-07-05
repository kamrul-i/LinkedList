package linkedlist_demo;
import java.util.LinkedList;
public class LinkedList_Demo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Afghanistan");
        linkedList.add("Pakistan");
        linkedList.add("Bangladesh");
        linkedList.add("UK");
        linkedList.add("USA");
        linkedList.add("UAE");
        linkedList.add("Sri Lanka");
        linkedList.add("Japan");
        linkedList.add("Maldives");
        linkedList.add("Nepel");
               
        //'for each loop' use করে result দেখানো হয়েছে।।
        for (String country : linkedList) {
            System.out.println(country);
        }
        System.out.println("Size of the Linked_List : " + linkedList.size());
        System.out.println("First element : "+linkedList.getFirst());
        System.out.println("Last element  : "+linkedList.getLast());
        
        System.out.printf("\n");
        linkedList.clear(); //এটার মানে সবকিছু clear করে দাও
        System.out.println(linkedList);

    }
}
