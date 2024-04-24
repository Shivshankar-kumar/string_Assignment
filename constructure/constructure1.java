package constructure;

import java.util.Scanner;

class student{
    private String name;
    private float marks;

    //creating a constructure
    student(String name,float marks){
        this.name=name;
        this.marks=marks;
    }

    //creating getters() method
    public String getName(){
        return name;
    }
    public float getMarks(){
        return marks;
    }
}
public class constructure1 {
    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the Name: ");
    String name=input.nextLine();
    System.out.println("Enter the Marks of Student: ");
    float marks=input.nextFloat();
    //calling a constructure
    student std=new student(name, marks);
    System.out.println(std.getName());
    System.out.println(std.getMarks());   
}
}