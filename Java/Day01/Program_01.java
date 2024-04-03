class Test{
    public void display(){
        System.out.println("Inside Test()");
    }
}

//Single java file can have single public class only.

//1.If class that contains main() is public then main className needs to hava same name as fileName
public class Program_01{
    public static void main(String args[]){
        System.out.println("Hello World!");
        main();
        //2.Methods can be only called in main() if they are static.


        Test t1;
        //Local variable


        //Refference variable -> Reffering to object on heap
        Test t2=new Test();
        //Reffrence var = Object()
        //Reffrence is stored on Stack
        //Object created is stored on heap
        t2.display();

    }
    //Main function overloading
    public static void main(){
        System.out.println("main()");
    }
}