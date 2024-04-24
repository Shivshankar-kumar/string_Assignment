#include<iostream>
using namespace std;

//Wap to implement of the multiple inheritance in c++. Where one class is derived and other one is base class

//Base /parent/Sub-class
/*class base1{
    //Data member
    private:
    int a,b,c;
    public:
    void input(){
        cout<<"Enter the Two Number for Base Class-1: ";
        cin>>a>>b;
    }
    public:
    void addition(){
        c=a+b;
        cout<<"Total Sum of Two Number: "<<c<<endl;
    }
};
class base2{
    private:
    int x,y,z;
    public:
    void input1(){
        cout<<"Enter the Two Number for Base class-2: "<<endl;
        cin>>x>>y;
    }
    public:
    void subs(){
        z=x-y;
        cout<<"Total answer is: "<<z<<endl;
    }
};
//derived class can inherit the multiple class in c++
class derived:public base1,public base2{
    private:
    int p,q,r;
    public:
    void input2(){
        cout<<"Enter the two number for Derived class perform multiple: ";
        cin>>p>>q;
    }
    public:
    void multiple(){
        r=p*q;
        cout<<"total Answer: "<<r<<endl;
    }
};
int main(){
    //Create a object of derived class
    derived ob;
    ob.input();
    ob.addition();
    ob.input1();
    ob.subs();
    ob.input2();
    ob.multiple();
    return 0;
}*/

class operation1{
    private: int a,b;
    public:
    void inp(){
        cout<<"Plz Enter the Two Value for Addition: ";
        cin>>a>>b;
    }
    void cal(){
        cout<<"Total Sum is:= "<<a+b<<endl;
    }
};
//sub-class
class operation2{
private: int a,b;
public:
    void inp(){
        cout<<"Plz Enter the Two Value for Multiplication: ";
        cin>>a>>b;
    }
    void cal(){
        cout<<"Total Multiplication is:= "<<a*b<<endl;
    }
};
//sub-class
class operation3{
    private: int a,b;
    public:
    void inp(){
        cout<<"Plz Enter the Two Value for Substraction: ";
        cin>>a>>b;
    }
    void cal(){
        cout<<"Total Substraction is:= "<<a-b<<endl;
    }
};
//sub-class
class operation4:public operation1,public operation2,public operation3{
    private: int a,b;
    public:
    void inp(){
        cout<<"Plz Enter the Two Value for Division: ";
        cin>>a>>b;
    }
    void cal(){
        cout<<"Quotient is:= "<<a/b<<endl;
    }
};
// class calculation{
//     public: void calc(operation1 op){
//         op.inp();
//         op.cal();
//     }
// }
int main(){
    //obbject
    operation4 obj;
    obj.inp();
    obj.cal();

    operation1 obj2;
    obj2.inp();
    obj2.cal();
    // obj.inp();
    // obj.cal();
    // obj.inp();
    // obj.cal();
    return 0;
}