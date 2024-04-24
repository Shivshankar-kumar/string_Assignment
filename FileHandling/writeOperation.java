package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//wap to write something in file
public class writeOperation {
    public static void main(String[] args) {
      File dir=new File("FileHandling");
      System.out.println(dir.getName());//FileHandling
      System.out.println(dir.exists());//true
      File file=new File(dir,"xbc.txt");//automatically created a file if it doesn't exist
      System.out.println(file.getName());//abc.txt
      System.out.println(file.isFile());//true //false 
      System.out.println(dir.getClass()); //java.io.File
      
      //to write something in file
      try { 
          FileWriter fw = new FileWriter(file,true);
          fw.write("Hello! Bachho");
          fw.write("\n");
          char []ch={'s','h','i','v','\n'};
          fw.write(ch);
          fw.close();
    } catch (IOException e) {
        System.out.println("Exception : "+e);
    }
    }
}
