class Solution {
    public int calculate(String s) {
        StackInteger stack = new Stack();
        int number = 0;
        int sign = 1;
        int result = 0;
        
        for(char c  s.toCharArray()){
            if(Character.isDigit(c)){
                number = (number10) + (int)(c-'0');
            }else if(c == '+'){
                result += signnumber;
                sign = 1;
                number = 0;
            }else if(c == '-'){
                result += signnumber;
                sign = -1;
                number = 0;
            }else if(c == '('){
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            }else if(c == ')'){
                result += signnumber;
                number = 0;
                result = stack.pop();
                result += stack.pop();
            }
        }
        
        result += signnumber;
        
        return result;
    }
}