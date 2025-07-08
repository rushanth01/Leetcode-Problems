class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum = nums[0];
        int minsum = nums[0];
        int currentmax = nums[0];
        int currentmin = nums[0];
        int totalsum = nums[0];

        for(int i =1;i<nums.length;i++){

            currentmax = Math.max(currentmax+nums[i],nums[i]);
            maxsum = Math.max(maxsum,currentmax);

            currentmin = Math.min(currentmin+nums[i],nums[i]);
            minsum = Math.min(minsum,currentmin);

            totalsum +=nums[i];
        }

        int circularsum = totalsum - minsum;

        if(circularsum == 0)
        return maxsum;

        return Math.max(circularsum,maxsum);

    }
}