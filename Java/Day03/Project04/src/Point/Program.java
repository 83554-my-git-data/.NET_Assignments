package Point;

public class Program {

	public static void main(String[] args) {
		
	
		
		Point p1=new Point(10,15);
		Point p2=new Point(15,10);
		
		boolean isEqual=p1.isEqual(p2);
		if(isEqual==true) {
			System.out.println("Points are equal");
		}else {
			System.out.println(p1.getDistance(p2));
		}

	}

}
