package interfaceEX;

import interfaceEX.employee.address;

class employee{
    private String name="Shiva";
    private float salery=78790.60f;
    public void disp(){
        System.out.println("Name: "+name+" "+"Salery : "+salery);
    }
    //Inner Class
    class address{
        int houseNo=139;
        String houseName="Balaji Complex";
        public void disp1(){
            System.out.println("House No: "+houseNo+" "+"Apartment: "+houseName);
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        //object 
        employee ep=new employee();
        ep.disp();
        // ep.new address().disp1(); //It will also work
         address ad=ep.new address();
         ad.disp1();
    }
}
