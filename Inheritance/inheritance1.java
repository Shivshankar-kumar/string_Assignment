package Inheritance;

//Super class //parent class //Base class
class employee{
    private int eId;
    private String name;
    void setEid(int eId){
        this.eId=eId;
    }
    void setName(String name){
        this.name=name;
    }
    void disp(){
        System.out.println("Name: "+" "+name+" "+"Age: "+" "+eId);
    }
}

//Sub class // child class // Derived class
class staff extends employee
{

}
public class inheritance1 {
    public static void main(String[] args) {
        //cteate object of employee class
        employee emp=new employee();
        emp.setEid(56789);
        emp.setName("Hari Om");
        emp.disp();
        //create object of staff class
        staff stf=new staff();
        stf.setName("Shivshankar");
        stf.setEid(34556);
        stf.disp();        
    }
}
