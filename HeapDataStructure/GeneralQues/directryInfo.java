import java.io.*;

//Wap to give an example of fetching the all name of a current directry
public class directryInfo {
    public static void main(String[] args) {
        File f=new File("D:\\premium_Java");
        //fetch all file name which present the directry
        String str[]=f.list();
        int count=0;
        //using forEach method to traverse on folder
        System.out.println("All File/Sub file is below which present in the :"+f.getParentFile());
        for(String name: str){
            count++;
            System.out.println(name);
        }
        System.out.println("Total Sub-Folder/File is: "+count);
    }
}
