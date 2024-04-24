package DataStructure.Backtracking;

public class stringSequence {
    public static void findSeq(int idx,String str,String ans){
        //Base case
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        findSeq(idx+1, str, ans.charAt(idx));
        findSeq(idx+1, str, ans.charAt(idx));
    }
    public static void main(String[] args) {
        findSeq(0,"abc","");
    }
}
