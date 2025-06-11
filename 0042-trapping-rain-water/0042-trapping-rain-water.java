class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int lmax = 0;
        int rmax = 0;
        int result = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= lmax)
                lmax = height[left];
                else
                result = result + (lmax - height[left]);
                left++;
            }
            else{
                if(height[right] >= rmax)
                rmax = height[right];
                else
                result = result + (rmax - height[right]);
                right--;
            }
        }
        return result;
    }
}