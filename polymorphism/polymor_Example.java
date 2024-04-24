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
class developer extends employee{
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
public class polymor_Example {
    public static void main(String[] args) {
        //object Creation
        developer dp=new developer();
        student std= new student();
        //parent class object
        employee emp=new employee();
        emp.input();
        emp.show();
        //here dp(references) addresses has been stored in emp(references);
        emp=dp;
        emp.input();
        emp.show();
        //here std(references) addresses has been stored in emp(references);
        emp=std;
        emp.input();
        emp.show();

        /*Here We can se emp which is reference variable of parent class and that have different behaviour. */
    }
}
