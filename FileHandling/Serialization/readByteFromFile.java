package FileHandling.Serialization;

//Wap to read data from file using deserialization
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.Flushable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;
//create a class and implements the serializable interface which is marker interface
class Student implements Serializable{
    private String name;
    private int roll;
    //constructor
    public Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    //Display method
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
    }
}
public class readByteFromFile {
    public static void main(String[] args) {
        Student std=new Student("Shivshankar", 89890);
        //std.display();
        //fileInputStream Class
        try{
        FileOutputStream fos=new FileOutputStream("FileHandling//abc.txt",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(std);
        oos.writeObject("\n");
        oos.flush();
        oos.close();
        try{
        FileInputStream fis=new FileInputStream("FileHandling//abc.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);
        Student st=(Student)ois.readObject();
        st.display(); 
        // ((Flushable) ois).flush();
        ois.close();
        }
        finally{
            System.out.println("Written Success");
        }
    }catch(IOException e){
        System.out.println("Exception: "+e);
    }
    catch(Exception ec){
        System.out.println(ec);
    }
    finally{
        System.out.println("Read Success");
    }
}
}
