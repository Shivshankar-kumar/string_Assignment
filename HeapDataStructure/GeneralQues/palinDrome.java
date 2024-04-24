import java.util.Scanner;

//Wap to check whether entered number is palindrome or not? 

public class palinDrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number to check PalinDrome Or Not?:");
        int n=in.nextInt();
        //strore the value of n, in another variable
        int n2=n;
        int reverse=0,remainde;
        while(n>0){
            remainde=n%10;
            reverse=(reverse*10)+remainde;
            n/=10;
        }
        if(n2==reverse){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palinDrome");
        }
    }
}
