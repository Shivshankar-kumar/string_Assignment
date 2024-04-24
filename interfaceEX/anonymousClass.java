package interfaceEX;

import Inheritance.abstract_Example;

//WAP to give an example of anonymous class with interface or abstract class
abstract class compny{
     void produceGarbage(){
        System.out.println("Company produce 2 million tonn garbage in a month");
    }
    abstract void stopIdea();
    abstract void action();
    abstract void request();
}
public class anonymousClass {
    public static void main(String[] args) {
        //Anonymous class is implemented inside this method
        compny cnp=new compny(){
            public void stopIdea(){
                System.out.println("Public wanted to stop this plastic company because this is too harmful for mankind");
            }
            public void action(){
                System.out.println("Hey! Beautiful people i'll solve this problem as well as so i would like to request you that keep patient and peace (:-");
            }
            void request(){
                System.out.println("Plz Plz for give me : Company said");
            }
    };
        cnp.produceGarbage();
        cnp.stopIdea();
        cnp.action();
        cnp.request();
        
    }
}
