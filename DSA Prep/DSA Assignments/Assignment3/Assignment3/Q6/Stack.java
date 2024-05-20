package Q6;

public class Stack {
	private char arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) {
		SIZE = size;
		arr = new char[SIZE];
		top = -1;
	}
	
	public void push(char value) {
		//1. reposition top
		top++;
		//2. add value at top index
		arr[top] = value;
	}
	
	public char pop() {
		//1. reposition top and return value of top index
		return arr[top--];
	}
	
	public char peek() {
		//1. read and return value of top index
		return arr[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE - 1;
	}


}













