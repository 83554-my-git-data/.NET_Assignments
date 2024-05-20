package q2;

import java.util.Scanner;



//2. Insert 5 elements in stack and find maximum value in stack without traversing it.
public class q2maximmuminstack 
{

	public static void main(String[] args) 
	{
		Stack st = new Stack(5);
		int choice,large=0;
		Scanner sc = new Scanner(System.in);
		
		
		do
		{
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek\n4.largest in stack");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			
			
			switch(choice) 
			{
			case 1://Push
			{
				if(st.isFull())
					System.out.println("Stack is full");
				else
				{
					System.out.print("Enter value : ");
					int value = sc.nextInt();
					st.push(value);
					if(large<value)
					{
					  large=value;	
				     // System.out.println("large is : "+large);	 	
					}
				}
			}
				break;
				
				
			case 2://Pop
			{
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Poped value : " + st.pop()); 
			}
				break;
				
				
			case 3://peek
			{
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Peeked value : " + st.peek());
			}
				break;
				
			case 4://largest in stack
			{
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("large is : "+large);	 		
			}
				break;
				
			}
		}while(choice != 0);
		sc.close();
	}

}
