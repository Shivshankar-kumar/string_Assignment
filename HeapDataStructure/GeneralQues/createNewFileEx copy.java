import java.io.*;
public class createNewFileEx {
    public static void main(String[] args) throws IOException {
        File dir=new File("FileHandling");
    System.out.println(dir.isDirectory());//false
    System.out.println(dir.mkdir());//true
    File file=new File(dir,"abc.txt");
    System.out.println(file.isFile());//false
    System.out.println(file.createNewFile());//true
    }
}
