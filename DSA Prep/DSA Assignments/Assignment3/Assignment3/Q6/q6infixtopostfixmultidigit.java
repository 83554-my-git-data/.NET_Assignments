package Q6;



public class q6infixtopostfixmultidigit 
{

	
	public static int prio(char opr) 
	{
		switch(opr)  
		{
			case '$': return 11;
			case '/': return 10;
			case '*': return 10;
			case '%': return 10;
			case '+': return 9;
			case '-': return 9;
		}
		return 0;
	}
	
	
	
	public static void main(String[] args) 
	{
		
		String infix ="10 + 20 - 30 * 40 ";//1020+3040*-
				//"25 + 30 ";//2530+
		
		String postfix  = infixToPostfix(infix);
		System.out.println("Infix : " + infix);
		System.out.println("Postfix : " + postfix);
		 
	}
	
	
	public static String infixToPostfix(String infix) 
	{
		//1. create stack to store operators
		Stack st = new Stack(20);
		
		//2. create string to store postfix expression
		StringBuilder postfix = new StringBuilder();//use StringBuilder as it is mutable --> changes can be made in original string
		//class string--> immutable
		
		
		//3. process infix expression from left to right
		for(int i = 0 ; i < infix.length() ; i++) 
		{
			//4. extract element from string (index i)
			char ele = infix.charAt(i);
			
	        if(ele==' ')
	        {
	         continue;	
	        }
			
			//5. if element is operand
	        else if(Character.isDigit(ele))
			{	// append element into postfix expr
			  	//postfix.append(ele);
			    while(infix.charAt(i)!=' ')
			    {
			    	postfix.append(infix.charAt(i));
			        i++;
			    }
			    i--;
			}
				
			else if(ele == '(')  //6. if element is '(' push it on stack
			{	
				st.push(ele);
			}
			else if(ele == ')') //7. if elememt is ')'
			{
				// pop elements from stack and append into postfix one by one till '('
				while(st.peek() != '(')
				{
					postfix.append(st.pop());
				}
				// discard '(' on stack
				st.pop();
			}
			//8. if element is operator
			else 
			{
				//9. check priority with topmost element in stack 
				while(!st.isEmpty() && prio(st.peek()) >= prio(ele)) 
				{
					postfix.append(st.pop());
//if priority of topmost element in stack is grater then or equal to current element then pop the top element from stack and append it to postfix expression
				}
				//10. push current element(operator) on stack
				st.push(ele);
			}
		}//end of for loop
	
		//11. pop remaining operators from stack and append into postfix one by one
		while(!st.isEmpty())
		{
			postfix.append(st.pop());
		}
		
		//12. return postfix expression
		return postfix.toString();//postfix is of type StringBuilder --> return type of function "infixToPostfix" is String
	                   //converting from StringBuilder to String
	}
	

	

}
