package linkedlist_demo;

public class Students {
    //এখানে ২টি class use করা হয়েছে।। এই class-এ variable declare করে, অন্য class থেকে তাকে call করা হয়েছে।।

    String name;
    int id;
    static String className = "twelve";
    //static ব্যবহার করে সবাইকে same Class-এ ধরা হয়েছে।।

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
