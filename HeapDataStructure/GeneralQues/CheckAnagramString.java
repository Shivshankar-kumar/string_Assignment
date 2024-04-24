import java.util.Arrays;
import java.util.Scanner;

//Wap to check entered String is Anagram or not?
//INput: peek
//input keep
//Output: String is Anagram

public class CheckAnagramString {
    void check_Anagram(String s1,String s2){

        //to convert in Character Array for Easy to Sort.
        char []ar1=s1.toCharArray();
        char []ar2=s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(Arrays.equals(ar1,ar2)){
            System.out.println("Entered Sttring is Anagram");
        }else{
            System.out.println("String is Not Anagram");
        }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the First String :");
        String str1=in.nextLine();
        System.out.println("Enter the second String :");
        String str2=in.nextLine();
        
        //Remove Space from Both String:
        str1=str1.replace(" ","");
        str2=str2.replace(" ","");
        
        //Convert String to lower case
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        //making an object of public class
        CheckAnagramString obj=new CheckAnagramString();
        obj.check_Anagram(str1,str2);
    }
}
