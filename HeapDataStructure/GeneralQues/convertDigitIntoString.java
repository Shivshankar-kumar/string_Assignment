

//Wap to convert a digit into words form using recursion, whether digit is entered by the user.
// Example: 67889
//Output: Sixty seven thousand eight hundred eighty nine. 
import java.util.Scanner;
public class convertDigitIntoString{
public static String convertToWords(int num){

    //Base Case condition
     if(num==0) return " Zero";

     if(num<0) return " minus"+convertToWords(Math.abs(num));

     //Blank String to store words.
     String words="";

     //Condition: 1
     //check for Lacs
     if(num/100000>0){
        words=words+convertToWords(num/100000)+" Lac";
        num%=100000;
     }

     //Condition: 2
     //check for Thousand

     if(num/1000>0){
        words=words+convertToWords(num/1000)+" thousand";
        num%=1000;
     }

     //Condition: 3
     //check for hundred

     if(num/100>0){
        words=words+convertToWords(num/100)+" Hundred";
        num%=100;
     }

     //Conditions for num>0 But num<100
     if(num>0){
     String unitmaps[]={" Zero", " One", " Two", " three"," four"," five"," six"," seven"," eight"," nine"," ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," ninteen"};

     String tensmap[]={" Zero"," ten"," twenty"," thirty"," fourty"," fifty"," sixty"," seventy"," eighty"," ninty"};
     //conditions for less than 100 number
     if(num<20){
        words=words+unitmaps[num];
     }else{
        words=words+tensmap[num/10];
        if(num%10>0){
            words=words+unitmaps[num%10];
        }
     }
    }
    return words;
}
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    System.out.print("Enter the Digit: ");
    int digit=input.nextInt();
    System.out.println(convertToWords(digit));
}
}