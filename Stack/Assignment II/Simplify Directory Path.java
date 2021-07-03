public class Solution {
    public String simplifyPath(String path) {
         StackString stack = new Stack();
        SetString set = new HashSet(Arrays.asList(..,.,));
        
        for(String str  path.split()){
            if(str.equals(..) && !stack.isEmpty()) stack.pop();
            else if(!set.contains(str)) stack.push(str);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
            sb.insert(0,);
        }
        
        return sb.length()  1    sb.toString();
    }
}