import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,rem=0;
        System.out.println("Enter The Decimal Number: ");
        num=sc.nextInt();

        while(num>0){
            rem=num%2;
            num/=2;
            System.out.println(rem);
        }
    }
}
