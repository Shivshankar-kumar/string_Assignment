package Inheritance;

//Example of single/Simple level Inheritance

//Super/Base/Parent class
class parent{
    String son_Name="Raghav Triveni";
    String daughter_Name="Kanchan Ranaut";
    parent(){
        System.out.println("Constructure can not inherited by the child: class: ");
    }
    void disp(){
        System.out.println("Son Name: "+son_Name);
        System.out.println("daughter Name: "+daughter_Name);
    }
}
//Sub/child/Derived Class
class child extends parent{

}
public class single_Level {
    public static void main(String[] args) {
       child ch=new child();
       ch.disp(); 
    }
}
