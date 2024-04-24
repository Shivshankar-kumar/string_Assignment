import java.util.Scanner;

public class contain_Unique_Or_Not {
void unique_Checker(String str){
    char []ch=str.toCharArray();
    int n=ch.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(ch[i++]==ch[j]){
                    System.out.println("Not Unique");
                    return;
                }
            }///
                    System.out.println("Unique");
                    return;
                }
            }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=in.nextLine();
        contain_Unique_Or_Not obj=new contain_Unique_Or_Not();
        obj.unique_Checker(str);
        // if(ans){
        //     System.out.println("Contain Unique Character");
        // }else{
        //     System.out.println("Not Contain Unique Character");
        // }
    }
}
