class Solution {
    public String removeDuplicateLetters(String s) {
        int count[] = new int[26];
        boolean visited[] = new boolean[26];
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
        
        for(char c : s.toCharArray()){
            count[c-'a']--;
            
            if(visited[c-'a']) continue;
            
            while(!stack.isEmpty() && c < stack.peek() && count[stack.peek()-'a'] != 0){
                visited[stack.pop()-'a'] = false;
            }
            
            visited[c-'a'] = true;
            stack.push(c);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        
        return sb.toString();
    }
}