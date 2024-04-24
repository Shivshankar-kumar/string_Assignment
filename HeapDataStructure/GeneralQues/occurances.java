
public class occurances{
    static boolean find_String(String str,int idx){
        //Base case:
        if(idx==str.length()) return false;
        return (str.charAt(idx)=='a') || find_String(str, idx+1);
    }
public static void main(String[] args) {
 String str="Umbrella";
 boolean ans=find_String(str, 0);
 System.out.println(ans);
//  if(ans){
//     System.out.println("YES");
//  }else{
//     System.out.println("No");
//  }
//  char []ch=str.toCharArray();
//  for(int i=0; i<ch.length; i++){
//     if(ch[i]=='e'){
//         System.out.println("YES");
//         break;
//     }else{
//         System.out.println("NO");
//     }
//  }   
}
}