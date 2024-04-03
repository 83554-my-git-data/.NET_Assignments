package Point;
import java.lang.Math;

public class Point {
	private double xAxis;
	private double yAxis;
	
	public Point() {
		this(0, 0);
		
	}
	public Point(int xAxis,int yAxis) {
		this.xAxis=xAxis;
		this.yAxis=yAxis;
	}
	
	public String getDetails() {
		String res;
		res="X = "+xAxis+" Y="+yAxis;
		return res;
	}
	
	public boolean isEqual(Point p2) {
		if(this.xAxis==p2.xAxis && this.yAxis==p2.yAxis) {
			return true;
		}else {
			return false;
		}
	}
	
	public float getDistance(Point p2) {
		return (float)(Math.sqrt(Math.pow((this.xAxis-p2.xAxis),2)+Math.pow((this.xAxis-p2.yAxis),2)));
	}
}
