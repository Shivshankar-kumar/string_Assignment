package Inheritance;

//super/Base/Parent Class
class demo1{
    public demo1(){
        System.out.println("Zeroparameterised constructor:");
    }
    public demo1(int a,int b){
        System.out.println("Parameterised constructor");
        int x=a;
        int y=b;
    }
}
//Derived/child/Sub-class
class demo2 extends demo1{
    //constructor
    public demo2(){
        super(12,23);
        System.out.println("Child Class no parameter");
    }
    public demo2(int m,int n){
        //this();
        System.out.println("child class with parameterised constructure");
        int a=m;
        int b=n;
    }
}
public class inheritance_With_Constructor{
    public static void main(String[] args) {
       //Object
       //demo1 d1=new demo1();
       //demo2 d2=new demo2(); 
       demo2 d3=new demo2(122,180);
    }
}