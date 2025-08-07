class Solution {
    public int singleNumber(int[] nums) {
        int res = 0 ;
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            for(int j = 0 ; j < nums.length;j++){
                if(nums[i] == nums[j])
                count++;
            }
            if(count == 1){
                res = nums[i];
            }
            count= 0;
        }
        return res;
    }
}