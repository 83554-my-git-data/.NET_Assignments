
public class wrapperClass_06 {

	public static void main(String[] args) {
		
		
		//Datatype is not a wrapper class.
		//But there is a wrapper class for each datatype.
		
		//Datatype -> Wrapper Class
		//int -> Integer
		//float -> Float
		//char-> Character
		//double -> Double
		//boolean -> Boolean
		
		
		//"Object" is base class of all objects in java.
		//Object is base class of Boolean , Number and Character
		
		//Information of prememptive is present in their Wrapper Classes.
		//Wrapper Classes are used to convert premptive datatype to non premeptive datatype
		
		int i=10;
		Integer i1=new Integer(i);//BOXING
		//Value type <- Reffernece 
		//Prememptive datatype is converted to premetive datatype.
		//Process of converting refferenece type to value type is called as BOXING.
		
		
		i1=20;//AUTO BOXING
		//Assigning value type to object.
		//Acts like conversion function
		//Reason for deprecating.
		
		
		Integer i2=new Integer(100);
		int i3=i2.intValue();//UNBXING
		//CONVERTING REFF -> VALUE TYPE UNBOXING
		//intValue() is a method from Integer wrapper class that return integer value.
		
		
		Integer i5=new Integer(100);
		int i6=i5;//AUTO-UNBXING
		
		
		//String to int using wrapper classes
		String abc="100";

		int xyz=Integer.parseInt(abc);
		System.out.println(xyz+10);
		
		

	}

}
