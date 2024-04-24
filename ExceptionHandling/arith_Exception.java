
//wap to give an example of try or catch method to handle the exception
public class arith_Exception{

    public static void main(String[] args) {
        int a=10,b=2,result;
        int ar[]={9,7,8};
        String n=null;
        try{
            result=a/b;
            System.out.println("result is="+result);
            int r=a/n.length();
            System.out.println(ar[9]);
        }
        catch(ArithmeticException ex){
            System.out.println("you can't divide any integer number by Zero");
        }
        catch(ArrayIndexOutOfBoundsException arr){
            System.out.println("you try to access out of limit index number");
        }
        catch(Exception e){
            System.out.println("something went worng");
        }
        System.out.println("ArithmeticException Example");
}
}