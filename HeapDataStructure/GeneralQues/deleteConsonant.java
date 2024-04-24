import java.util.Scanner;

public class deleteConsonant {
    static String removeConsonants(String str){
        return str.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]","");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String: ");
         String str=in.nextLine();
         System.out.print(removeConsonants(str)+" ");
        // int vowel=0;
        // for(int i=0; i<str.length(); i++){
        //     char ch=str.charAt(i);
        //     if((ch>='a'&&ch<='z') ||(ch>='A' && ch<='Z')){
        //         if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
        //             //System.out.print(str);
        //         }else{
        //             str=str.concat("");
        //         }
        //     }
        // }
        // System.out.println(str);
    }
}
