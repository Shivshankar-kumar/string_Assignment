package Inheritance;


//Super class/parent class/Base class
class college{
    void department(){
    System.out.println("Most student belong to Bca Dept.");
}
}
class department extends college{
    void c_Name(){
        System.out.println("My college name is FOS");
    }
}
class student extends college{
    void course(){
        System.out.println("Bca course is not suitable for science Student");
    }
}
public class hierarchical_Level {
    public static void main(String[] args) {
        student st=new student();
        st.department();
        st.course();
        //st.c_Name(); Error
    }
}
