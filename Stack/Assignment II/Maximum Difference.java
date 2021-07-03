class Solution
{
    int findMaxDiff(int a[], int n)
    {
	    Stack<Integer> stack = new Stack<Integer>();
	    
	    int left[] = new int[n];
	    int right[] = new int[n];
	    
	    for(int i = 0; i < n; ++i){
	        while(!stack.isEmpty() && stack.peek() >= a[i]) stack.pop();
	        if(!stack.isEmpty()) left[i] = stack.peek();
	        stack.push(a[i]);
	    }
	    
	    stack = new Stack<Integer>();
	    
	    for(int i = n-1; i >= 0; --i){
	        while(!stack.isEmpty() && stack.peek() >= a[i]) stack.pop();
	        if(!stack.isEmpty()) right[i] = stack.peek();
	        stack.push(a[i]);
	    }
	    
	    int max = 0;
	    
	    for(int i = 0; i < n; ++i){
	        max = Math.max(Math.abs(left[i]-right[i]),max);
	    }
	    
	    return max;
    }
}