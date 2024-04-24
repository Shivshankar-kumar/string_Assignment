package constructure;


class overLoading{
    private String name;
    private int age;
    public overLoading(){
        System.out.println("Zero parametersize constructure Executed: ");
        name="Shivshankar";
        age=20;
    }
    public overLoading(String name){
        this.name=name;
        age=40;
    }
    public overLoading(String name,int age){
        this.name=name;
        this.age=age;
    }
    void disp(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class cnst_OverLoading {
    public static void main(String[] args) {
        //zero parameterise constructure calling
        overLoading obj1=new overLoading();
        obj1.disp();
        //One parameterise constructure calling
        overLoading obj2=new overLoading("Mohit Yadav");
        obj2.disp();;
        //two parameterise constructer calling
        overLoading obj3=new overLoading("Rameshvaram kataria",56);
        obj3.disp();
    }
}
