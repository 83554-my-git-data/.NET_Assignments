
public class languageFundamentals_03 {

	public static void main(String[] args) {
		
		//Variable is a container to store perticular type of data.
		//Variable also points to memory address.
		
		//Literal is a constant value used to asssign to variable.
		
		
		//1.Boolean datatype
		
		boolean flag=true;
		//Boolean can either hold true or false values
		//Size of boolean is 1 bit but it can not be identified.
		//flag is a variable and true is boolean literal.
		
		//2.Integral Datatypes
		byte b1=10;
		//b1= variable 10=Integral literal
		
		System.out.println("Bute b1 : "+b1+"Size of byte is :"+(int)Byte.BYTES+"range of byte is :"+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
		//Byte is a wrapper class from byte datatype
		//It contains methods like BYTES to get size and MIN_VALUE and MAX_VALUE To get the range
		
		int i1=10;
		System.out.println("int i1 : "+i1+"Size of byte is :"+(int)Integer.BYTES+"range of integer is :"+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
		
		
		short s1=10;
		System.out.println("Short s1 : "+s1+"Size of short is :"+(int)Short.BYTES+"range of short is :"+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
		
		long l1=10;
		System.out.println("long l1 : "+l1+"Size of long is :"+(int)Long.BYTES+"range of long is :"+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
		
		//3.Floating point Datatypes
		float f1=10.01f;
		//f1 is variable and 10.01f is Floating Point literal
		System.out.println("float b1 : "+f1+"Size of float is :"+(int)Float.BYTES+"range of float is :"+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
		//Range of float is largest so used for highest precision.
		
		
		double db1=10;
		System.out.println("double db1 : "+db1+"Size of byte is :"+(int)Double.BYTES+"range of double is :"+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
		
		
		//4.Character Datatype
		char ch='A';
		//ch is a variable and 'A' is character literal
		System.out.println("Character ch : "+ch+" Size of character is "+Character.BYTES+" Range of characters is "+Character.MIN_VALUE+" to "+Character.MAX_VALUE);
		
		
		//5. NULL is also a literal constant
		//6. String is also a literal constant
	}

}
