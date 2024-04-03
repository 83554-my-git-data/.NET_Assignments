package package1;
import package2.Program03;

public class Program01 extends Program03{
	
	public void accept() {
		this.no3=15;
	}
	
	public static void main(String[] args) {
		Program03 p1=new Program03();
		
		//If class is inherited then fields and methods are directly accessible and public members are accessible through object
				//System.out.println(p1.no1);//NOT 			NA
				//System.out.println(p1.no2);//DEFAULT		NA
				
				System.out.println(p1.no4);//PUBLIC
				
				//Accessing default class is not allowed outside different package
				//test t=new test();
	}

}

