package Digit_IntoWords;

//write a program to convert digit into words using recursion.
//Example: 
//     INput: 80567
//     Output: Eighty thousand five hundred sixty seven

public class digit_Into_Words {

    // Function definition
    public static String digitIntoWords(int num){

        //Base Case condition
        if(num==0) return " Zero";

        //Condition for negative Number:
        if(num<0) return digitIntoWords(Math.abs(num))+" minus";

        //Empty String to store the result
        String words="";

        //Check for million
         if(num/10000000>0){
            words=words+digitIntoWords(num/10000000)+" Million";
            num%=10000000;
        }
        //check for lacs
        if(num/100000>0){
            words=words+digitIntoWords(num/100000)+" Lac";
            num%=100000;
        }

        //Check for thousnad
        if(num/1000>0){
            words=words+digitIntoWords(num/1000)+" thousand";
            num%=1000;
        }
        //check for hundred
        if(num/100>0){
            words=words+digitIntoWords(num/100)+" hundred";
            num%=100;
        }
        //check for less than 100
        if(num>0){
            String unitMap[]={" Zero"," One"," two"," three", " four"," five"," six"," seven"," eight"," nine"," ten"," eleven"," tweleve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," ninteen"};

            String tensMap[]={" Zero"," ten"," twenty"," thirty"," fourty"," fifty"," Sixty", " Seventy", " Eighty"," Ninty"};

            //check for less than twenty
            if(num<20){
                words=words+unitMap[num];
            }else{
                words=words+tensMap[num/10];
                if(num%10>0){
                    words=words+unitMap[num%10];
                }
            }
        }
        return words;
    }
    public static void main(String[] args) {
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("Enter the Digit: ");
        int digit=input.nextInt();
        System.out.println(digitIntoWords(digit));
    }
}
