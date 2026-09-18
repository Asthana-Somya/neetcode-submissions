class Solution {
    public boolean isValid(String s) {
      Stack<Character>st = new Stack<>();
      
      
       if(s.length() % 2 !=0) return false;

       for(char ch : s.toCharArray()){
        if( ch =='(' || ch  == '[' || ch == '{'){
            st.push(ch);
        }
        else{
           if( st.isEmpty()){
                return false;
            }
            else{
                char top = st.peek();
              if (top == '(' && ch == ')' || 
                  top == '{' && ch == '}' ||
                  top ==  '[' && ch == ']' ) {
            
           
                  st.pop();
                }
                else{
                    return false;
                }
            }
        }
        
        
       }
       if(st.isEmpty()){
        return true;  
       }
       return false;
    }
}
