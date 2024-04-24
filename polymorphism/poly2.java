package polymorphism;

import java.util.Scanner;
//In this programme we've implemented polymorphism concept.
class employee{
    Scanner sc=new Scanner(System.in);
    private int id;
    private String name;
    void input(){
        System.out.println("Enter the Name of Employee: ");
        name=sc.nextLine();
        System.out.println("Enter the E-Id: ");
        id=sc.nextInt();
    }
    void show(){
        System.out.println("Name: "+name+" "+"E-Id: "+id);
    }
}
class student extends employee{
    //Scanner sc=new Scanner(System.in);
    private String name;
    private int id;
    //method override
    void input(){
        System.out.println("Enter the Student Name: ");
        name=sc.nextLine();
        System.out.println("Enter the Student Id: ");
        id=sc.nextInt();
    }
    void show(){
        System.out.println("Student name: "+name+" "+"S-Id: "+id);
    }
}
class developer extends employee {
    Scanner sc=new Scanner(System.in);
    private String name;
    private int id;
    void input(){
        System.out.println("Enter the developer Name: ");
        name=sc.nextLine();
        System.out.println("Enter the Dveloper id: ");
        id=sc.nextInt();
    }
    void show(){
        System.out.println("Developer Name: "+name+" "+"D-Id: "+id);
    }
}
class detail{
    public void info(employee emp){
        emp.input();
        emp.show();
    }
}
public class poly2 {
    public static void main(String[] args) {
        student std=new student();
        developer dp=new developer();
        //detail object
        detail d=new detail();
        d.info(std);
        d.info(dp);
    }
}
