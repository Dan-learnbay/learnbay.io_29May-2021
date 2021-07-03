class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack();
        
        for(char c : s.toCharArray()){
            if(c == ']'){
                StringBuilder sb = new StringBuilder();
                while(stack.peek() != '['){
                    sb.insert(0,stack.pop());
                }
                stack.pop();
                StringBuilder num = new StringBuilder();
                
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    num.insert(0,stack.pop());
                }
                
                int count = Integer.parseInt(num.toString());
                StringBuilder repeat = new StringBuilder(sb.toString());
                
                while(count > 1){
                    repeat.append(sb);
                    --count;
                }
                
                for(char ch : repeat.toString().toCharArray()) stack.push(ch);
            }else{
                stack.push(c);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        
        return sb.toString();
    }
}