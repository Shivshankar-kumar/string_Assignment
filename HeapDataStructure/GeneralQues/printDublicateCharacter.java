public class printDublicateCharacter{
    
    //wap to print Dublicate Character from a string.

    public static void main(String[] args) {
    String str="feedback apple";
    char []ch=str.toCharArray();
    for(int i=0; i<ch.length; i++){
        for(int j=i+1; j<ch.length; j++){
            if(ch[i]==ch[j]){
                System.out.print(ch[i]+" ");
            }
        }
    }    
    }
}