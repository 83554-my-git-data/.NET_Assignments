package package2;

public class Program03 {
	private int no1;//Accessible to class methods only
	int no2;//Default access modifier
	protected int no3;//Protected fields are accessible in package and inhertited classes
	public int no4;//Public data members are accessible everywhere
	
	public void displayFromProgram01() {
		System.out.println("Private no1 "+no1);
		System.out.println("Default no2 "+no2);
		System.out.println("Protected no3 "+no3);
		System.out.println("Public no4 "+no4);
	}
	
	
}
//Default class visibility is limited to package
class test{
	public void display() {
		System.out.println("Inside test class");
	}
}