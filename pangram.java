public class pangram {
    
    //Wap to check whether entered String is Pangram or Not?
    public static void main(String[] args) {
        String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        //remove Space from string
        str=str.replace(" ","");
        char ch []=str.toCharArray();
        char []ar=new char[26];
        boolean flag=false;

        for(int i=0; i<ch.length; i++){
            ar[ch[i]-65]++;
        }
        for(int i=0; i<ar.length; i++){
            if(ar[i]==0){
                System.out.println("Not pangram");
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("String is Pangram");
        }
    }
}
