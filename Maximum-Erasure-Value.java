class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        
        int right = 0 ;
        int left = 0;
        int maxsum = 0;
        int currentsum = 0;

        while(right < nums.length){
            while(temp.contains(nums[right])){
                temp.remove(nums[left]);
                currentsum -= nums[left];
                left++;
            }
            temp.add(nums[right]);
            currentsum += nums[right];
            maxsum = Math.max(currentsum,maxsum);
            right++;
        }
        return maxsum;
    }
}