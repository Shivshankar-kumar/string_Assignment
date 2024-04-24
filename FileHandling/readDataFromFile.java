package FileHandling;
import java.io.File;
//import java.io.OutputStream;
import java.io.FileReader;
import java.io.IOException;
public class readDataFromFile {
    public static void main(String[] args) {
        //To create an object and give the proper path of directry
        File dir=new File("D:\\Html\\BasicWork");
        System.out.println(dir.isDirectory());//true
        System.out.println(dir.getName());//collectionFrameWork
        System.out.println(dir.getClass());//java.io.File

        //go to on particular file passing the proper address
        File file=new File(dir,"form.html");
        
        //to read data using fileReader Class
        long l=file.length();
        try{
        FileReader fr=new FileReader(file);
        //read() method returns all char in ASCII Code which is integer
        int n=fr.read();
        //Traverse
        while(n!=-1){
            System.out.print((char)n+"");//type cast from integer to char
            n=fr.read();
        }
    }catch(IOException e){
        System.out.println("Exception: "+e);
    }
    finally{
        System.out.println("Total Characters are: "+l);
    }
    }
}
