package linkedlist_demo;

public class Students {
    //এখানে ২টি class use করা হয়েছে।। এই class-এ variable declare করে, অন্য class থেকে তাকে call করা হয়েছে।।
    
    String name, className;
    int id;
    
    Students(int id, String name, String className){
        this.id = id;
        this.name = name;
        this.className = className;
    }
    
}
