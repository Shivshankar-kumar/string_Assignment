import java.util.Scanner;

public class sentence_Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=in.nextLine();
        String str1="";
        String arr[]=str.split("");
        for(String val:arr){
        for(int i=val.length()-1; i>=0; i--){
            str1=str1+str.charAt(i);
        }
    }
        System.out.print(str1+" ");
    }
}
