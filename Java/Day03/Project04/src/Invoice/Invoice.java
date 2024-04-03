package Invoice;

import java.util.Scanner;

public class Invoice {
	Scanner sc=new Scanner(System.in);
	private String partNo;
	private String partDesc;
	private int qty;
	private double perItemPrice;
	private double totalAmt;
	public Invoice() {
		this("","",0,0);
	}
	public Invoice(String partNo,String partDesc,int qty,double perItemPrice) {
		this.partNo=partNo;
		this.partDesc=partDesc;
		
		
		if(qty<0){
			this.qty=0;
		}else {
			this.qty=qty;
		}
		
		
		if(perItemPrice<0) {
			this.perItemPrice=0;
		}else {
			this.perItemPrice=perItemPrice;
		}
		
		
		
		}
	
	public void acceptProduct() {
		System.out.println("Enter a partNo");
		partNo=sc.nextLine();
		System.out.println("Enter a partDesc");
		partDesc=sc.nextLine();
		System.out.println("Enter a QYT");
		qty=sc.nextInt();
		System.out.println("Enter total amount");
		totalAmt=sc.nextDouble();
	}
	
	public double getTotalAmt() {
		return qty*perItemPrice;
	}

}
