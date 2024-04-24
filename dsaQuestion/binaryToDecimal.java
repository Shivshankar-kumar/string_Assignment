import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int last_Digt=0,res=0;
        System.out.println("Entert the Number:");
        int num=sc.nextInt();

        while(num>0){
            last_Digt=num%10;
            num/=10;
            res+=(2*last_Digt);
            System.out.print(last_Digt);
        }
    }
}
