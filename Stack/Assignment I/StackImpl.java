package practice;

class Stack{
	private int stackArray[];
	private int top;
	
	public Stack() {
		stackArray = new int[2];
		top = -1;
	}
	
	public int size() {
		return top+1;
	}
	
	public int capacity() {
		return stackArray.length;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("STACK UNDERFLOW !!");
			return -1;
		}
		
		int num = stackArray[top--];
		
		if(top == stackArray.length/4) {
			int tempArray[] = new int[stackArray.length/2];
			
			for(int i = 0; i < tempArray.length;++i) {
				tempArray[i] = stackArray[i];
			}
			
			stackArray = tempArray;
		}
		
		return num;
	}
	
	public void push(int n) {
		
		if(top == stackArray.length-1) {
			int tempArray[] = new int[stackArray.length*2];
			
			for(int i = 0; i <stackArray.length; ++i) {
				tempArray[i] = stackArray[i];
			}
			
			stackArray = tempArray;
			
		}
		
		stackArray[++top] = n;
	}
}
public class StackImpl {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(10);
		System.out.println("Stack size " + stack.capacity());
		stack.pop();
		stack.pop();
		System.out.println("Stack size " + stack.capacity());
		stack.pop();
		System.out.println("Stack size " + stack.capacity());
	}
}
