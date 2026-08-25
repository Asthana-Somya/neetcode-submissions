class Solution {
    public boolean isPalindrome(String s) {
        
      String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       int n = result.length();
      int start =0;
      int end = n-1;
      while(start < end){
        if(result.charAt(start) != result.charAt(end)){
            return false;
        }
        else{
            start++;
            end--;
        }
      }
      return true;
    }
}
