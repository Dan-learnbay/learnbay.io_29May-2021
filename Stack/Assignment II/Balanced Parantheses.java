public class Solution {
    public int solve(String A) {
        StackCharacter stack = new Stack();

        for(char c  A.toCharArray()){
            if(c == ')') {
                if(stack.isEmpty()) return 0;
                stack.pop();
            }
            else stack.push(c);
        }

        return stack.isEmpty()  1  0;
    }
}