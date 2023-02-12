import java.util.Scanner;

//Wap to find maximum occurrance in give string.

public class find_Max_Occurrancing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=in.nextLine();
        char ans='0';
        char []ch=str.toCharArray();
        for(int i=0; i<ch.length; i++){
            for(int j=i+1; j<ch.length; j++){
                if(ch[i]==ch[j]){
                    ans=ch[i];
                    System.out.println("max char is in string: "+ans);
                }
            }
        }
    }
}
