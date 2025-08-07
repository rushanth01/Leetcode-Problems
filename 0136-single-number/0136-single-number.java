class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int left = nums.length-1;
        int res = 0;
        while(left > 0){
           if(nums[left] != nums[left-1]){
            return nums[left];
           } 
           else{
            left -=2;
           }
        }
        return nums[0];
    }
}   