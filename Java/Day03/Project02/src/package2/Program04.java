package package2;
import package2.Program03;

public class Program04 {

	
	//SAME PACKAGE
	
	public static void main(String[] args) {
		Program03 p1=new Program03();
		//Within package all fields of imported class are accesible except private
		//System.out.println(p1.no1);//NOT ALLOWED PRIVATE
		System.out.println(p1.no2);//DEFAULT
		System.out.println(p1.no3);//PROTECTED
		System.out.println(p1.no4);//PUBLIC
		
		
		//Accesing default class within package
		test t=new test();
		t.display();
	}

}
