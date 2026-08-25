class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int n = numbers.length;
       int[] ans  = new int[2];
       int start =0;
       int end = n-1;
       int sum = 0;
       while(start < end) {
        sum = numbers[start] + numbers[end];
         if(sum < target){
            start++;
         }
         else if(sum > target){
            end--;
         }
         else{
           ans[0] = start + 1;
           ans[1] = end +1;
           break;
         }
       }
       return ans;
    }
}
