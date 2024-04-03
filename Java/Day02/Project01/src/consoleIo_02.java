import java.io.Console;


public class consoleIo_02 {

	public static void main(String[] args) {
		// Console is a object of console class.
		//Used to accept input from user but only works in CLI.
		
		Console console=System.console();
		//console is a class where constructor is private.
		//So object is created using .console() method.
		
		String password;
		String email;
		
		System.out.println("Enter a email");
		email=console.readLine();
		
		System.out.println("Enter a password");
		password=console.readPassword();
		//Returns array of characters in encrypted format.
		
		System.out.println("Email is : "+email+" Password is "+password);
		
	}

}
