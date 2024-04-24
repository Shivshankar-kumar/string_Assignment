package FileHandling.Serialization;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Employee implements Serializable{
    private String name;
    private int age,salery;
    //constructor
    public Employee(String name,int age,int salery){
        this.name=name;
        this.age=age;
        this.salery=salery;
    }
    @Override
    public String toString(){
        return name+" "+age+" "+salery;
    }
}
public class writeByte {
    public static void main(String[] args) {
        Employee emp=new Employee("Shivshankar", 19, 44560);
        //object of FileObjectStream to write data on file in the form of byte.
        try{
        FileOutputStream fout=new FileOutputStream("FileHandling//abc.txt",true);
        BufferedOutputStream bos=new BufferedOutputStream(fout);
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(emp);
        oos.writeObject("\n");
        oos.flush();
        oos.close();
        }
        catch(IOException e){
            System.out.println("\n\n "+e);
        }
        finally{
            System.out.println("Success");
            System.out.println(emp);
        }
    }
}
