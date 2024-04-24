import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int digit=sc.nextInt();
        int orgDigit=digit;
        int remainder,reverse=0;
        while(digit>0){
            remainder=digit%10;
            reverse=(reverse*10)+remainder;
            digit/=10;
        }
        System.out.println("Digit: "+orgDigit+" "+"Reverse digit: "+reverse);
    }
}
