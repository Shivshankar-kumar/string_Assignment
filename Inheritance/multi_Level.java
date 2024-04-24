package Inheritance;

//Example of multilevel inheritance Where each class can inherit their parent class

//parent/super/Base Class
class parent{
    void disp(){
        System.out.println("parent Class can inherit only near child");
    }
}

//child/sub/Derived class
class child1 extends parent{

}
class child2 extends child1{

}
class child3 extends child2{

}
public class multi_Level {
    public static void main(String[] args) {
        child3 ch=new child3();
        ch.disp();
    }
}