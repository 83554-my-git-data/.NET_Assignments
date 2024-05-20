
//3. Create an array of integers. Reverse the array using stack
package Q3;

import java.util.Arrays;
import java.util.Scanner;



public class q3reversearraystack 
{

	public static void main(String[] args)
	{
		
        int arr[]= {10,20,30,40,50};
        Stack st = new Stack(arr.length);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		
		do
		{
			System.out.println("1.reverese array");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			
			
			switch(choice) 
			{
			
			
				
				case 1://reverse array
				{
					System.out.println("Before reverse : "+Arrays.toString(arr));
					int flag=0;
				
					for (int i = 0; i < arr.length; i++)
					{
							st.push(arr[i]);					
					}
					
					for (int i = 0; i < arr.length; i++) 
					{
					  arr[i]=st.pop();	
					}
					System.out.println("After reverse : "+Arrays.toString(arr));
					
				}
					break;
				
				
			}
		}while(choice != 0);
		sc.close();		

	}

}
