package Inheritance;
import java.util.Scanner;

//wap to give an example of abstract keyword.
class empl{
    Scanner sc=new Scanner(System.in);
    private int age;
    private String name;
     void input1(){
        System.out.println("Enter the name of Employee : ");
        name=sc.nextLine();
        System.out.println("Enter the Age of Employee: ");
        age=sc.nextInt();
    }
    void disp1(){
         System.out.println("Employee Name: "+name+" "+"Age: "+age);
}
}
//sub-class
class dev extends empl{
    //Scanner sc=new Scanner(System.in);
    private String name;
    private int age;
    void input1(){
        System.out.println("Ente the name of developer: ");
        name=sc.nextLine();
        System.out.println("Enter the Age of developer  : ");
        age=sc.nextInt();
    }
    void disp1(){
        System.out.println("Developer Name: "+name+" "+"Age: "+age);
    }
}
//Sub-class
class engineer extends dev{
    //Scanner sc=new Scanner(System.in);
    private int age;
    private String name;
    void input1(){
        System.out.println("Ente the name of Engineer : ");
        name=sc.nextLine();
        System.out.println("Enter the Age of Engineer : ");
        age=sc.nextInt();
    }
    void disp1(){
        System.out.println("Engineer Name: "+name+" "+"Age: "+age);
    }
}
class detai_Show{
    public void dis(empl ref){
        ref.input1();
        ref.disp1();
    }
}
public class abstract_Example{
    public static void main(String[] args) {
        //object
        dev e =new dev();
        engineer eng=new engineer();
        detai_Show dp=new detai_Show();
        dp.dis(e);
        dp.dis(eng);
    }
}