
//Works only in CLI
//If provided invalid no of arguments then throws out of bounds exception.

public class commandLineArguments_04 {
	//						args[] is a array of String type
	public static void main(String[] args) {
		
		if(args.length==2) {
			System.out.println("Sum of Command Line Arguments is "+(args[0]+args[1]));
		}else {
			System.out.println("Invalid no of arguments");
		}
		

	}

}
