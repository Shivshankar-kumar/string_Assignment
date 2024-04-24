package interfaceEX;
import java.util.Scanner;
interface a{
    String name="Kim bim ji";
    void takeInput();
    void display();
    static void print(){
    System.out.println(name);
    }
}
class subClass1 extends interface_Ex1{
    Scanner sc=new Scanner(System.in);
    private int a,b;
     public void takeInput(){
        System.out.println("Enter the Value of Two Number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println();
    }
    public void display(){
        System.out.println("Sum is = "+(a+b));
    }
    //specialised Method
    public void disp(){
        System.out.println("Sub class Body Has been executed");
    }
}
public class interface_Ex1{
    public static void main(String[] args) {
        //System.out.println(a.name);
        a ref;
        subClass1 sy=new subClass1();
        // subClass1 sb=new subClass1();
        sy.takeInput();
        sy.display();
        //((superClass) sy).print();
        //Down Casting
        ((subClass1) sy).disp();
    }    
}