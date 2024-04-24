package interfaceEX;

//wap to give an example of lemda expression with interface.
//lemda expressioin only apply on functional interface
interface algebra{
    void sub(int a,int b);
}

public class lemda_Expression {
    public static void main(String[] args) {
        // interface with lemda expression
        algebra al=(int x,int y)->
                System.out.println("Substraction :"+(x-y));
         al.sub(100,90);
    }
}
