import java.util.Scanner;

//Wap to count the number of vowels,consonant,digit and special character in enterd string.

public class counVowel {
    void findVowel_Consonant(String str){
        int vowel=0,consonant=0,digit=0,specialChar=0;
        int n=str.length();
        for(int i=0; i<n; i++){
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                if((ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') || (ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U')){
                    vowel++;
                }else{
                    consonant++;
                }
            }
            else if(ch>='0' && ch<='9'){
                digit++;
            }else{
                specialChar++;
            }
        }
            System.out.print("\nvowel: "+vowel);
            
            System.out.print("\nConsonant: "+consonant);
            
            System.out.print("\ndigit: "+digit);
            
            System.out.print("\nSpecial Character: "+specialChar);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Any String ");
        String str=in.nextLine();

        //Creating a object
        counVowel obj=new counVowel();

        //calling to a method
        obj.findVowel_Consonant(str);

    }
}
