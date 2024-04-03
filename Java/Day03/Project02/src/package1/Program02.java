package package1;
import package2.Program03;


public class Program02 {

	//ANOTHER PACKAGE
	
	public static void main(String[] args) {
		Program03 p1=new Program03();
		//In different package apart from Public no other access modifier is accessible
				//System.out.println(p1.no1);//NOT 			NA
				//System.out.println(p1.no2);//DEFAULT		NA
				//System.out.println(p1.no3);//PROTECTED	NA
				System.out.println(p1.no4);//PUBLIC

	}

}
