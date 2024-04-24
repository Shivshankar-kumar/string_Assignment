package interfaceEX;
    //INterface
    interface company{
        void mnf();
        void Import();
        default void hire(){
            System.out.println("Company Hired 50 Employee per Month");
        }
        static int layOff(int x){
            System.out.println("Company is laying off "+x+" employee per month");
            return x;
        }
    }
    class emp implements company{
        public void mnf(){
            System.out.println("Company is manufacture the Undergarment product");
        }
        public void Import(){
            System.out.println("All product can import or export");
        }
        public void address(){
            System.out.println("Noida NH-31, Inside Foor chouk vishnu Complex 3rd Floor");
        }
    }
    public class ex2{   
public static void main(String[] args) {
    //object
    //Anonymous class
    company cmp=new emp() {
    //  public void mnf(){
    //         System.out.println("oWoo (:-");
    //     }
    //     public void Import(){
    //         System.out.println("Nice Working");
    //     }
    };
    cmp.mnf();
    cmp.Import();
    cmp.hire();
    //DownCasting
    ((emp)cmp).address();
    emp e=new emp();
    company.layOff(21);
}
    }