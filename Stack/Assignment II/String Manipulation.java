class Solution 
{
      
    static int removeConsecutiveSame(Vector <String > v) 
    {
        Stack<String> stack = new Stack<String>();
        
        for(String str: v){
            if(!stack.isEmpty() && stack.peek().equals(str)){
                stack.pop();
            }else{
                stack.push(str);
            }
        }
        
        return stack.size();
    }
}