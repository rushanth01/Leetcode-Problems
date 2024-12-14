class Solution {
    public int maxProduct(int[] nums) {
        int prd = nums[0];
        int ans = nums[0];
        int n =nums.length;
         for(int i = 0; i< n ;i++){
            prd = 1;
            for(int j = i ; j < n;j++){
                prd =prd*nums[j];
                ans = Math.max(ans,prd);
            }
        }   
        return ans; 
    }
}
