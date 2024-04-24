import java.io.File;

public class fileCharCount {
    public static void main(String[] args) {
        File f=new File("contain_Unique_Or_Not.java");
        long l=f.length();
        System.out.println("Number Of Character in: "+f.getName()+" "+l);
    }
}
