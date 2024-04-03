package point;

public class Point {

	private int xaxis;
	private int yaxis;
	
	public Point() {
		this(10,15);//constructor chaining
		System.out.println("Inside Parameterless deafult constructor");
		
	}
	public Point(int xaxis, int yaxis) {
		this.xaxis=xaxis;
		this.yaxis=yaxis;
	}
	void setXaxis(int xaxis) {
		this.xaxis=xaxis;
	}
	void setYaxis(int yaxis) {
		this.yaxis=yaxis;
	}
	int getXaxis() {
		return xaxis;
	}
	int getYaxis() {
		return yaxis;
	}
	void displayPoint() {
		System.out.println("Xaxis is "+xaxis+" Yaxis is "+yaxis);
	}
}
