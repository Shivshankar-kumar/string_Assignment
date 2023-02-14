package settersAndGetters;

import java.util.Scanner;

class student{
    private int age;
    private String name;
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void show(){
        System.out.println("Name: "+name+" "+" Age: "+age);
    }
}
public class settersGetters {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        student obj1=new student();
        System.out.println("Enter the Name: ");
        String name=in.nextLine();
        System.out.println("Enter the Age: ");
        int age=in.nextInt();
        obj1.setAge(age);
        obj1.setName(name);
        obj1.show();
    }
}
