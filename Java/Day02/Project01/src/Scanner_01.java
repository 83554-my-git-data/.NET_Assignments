import java.util.Scanner;

public class Scanner_01 {

	public static void main(String[] args) {
		
			//Scanner is a resources so needs to be closed after usage
			Scanner sc=new Scanner(System.in);
			//Scanner is a object from Scanner class
			//It takes " in " as a argument which is field from inputstream class.
			
			int a;
			String b;
			double c;
			float d;
			System.out.println("Enter Int a");
			a=sc.nextInt();
			System.out.println("Enter String b");
			sc.nextLine();
			b=sc.nextLine();
			System.out.println("Enter Double c");
			c=sc.nextDouble();
			System.out.println("Enter float d");
			d=sc.nextFloat();
		
			System.out.println("a : "+a+" b :"+b+" c :"+c+" d : "+d);
	}

}
