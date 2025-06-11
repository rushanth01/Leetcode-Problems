class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int max = 0;
        while(left < right){
            int min = Math.min(height[left],height[right]);
            int width = right - left;
            int area = min * width;
            max = Math.max(max,area);
            if(height[left] < height[right])
            left++;
            else
            right--;
        }
        return max;
    }
}