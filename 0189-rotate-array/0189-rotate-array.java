class Solution {
    public void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k%n;
    //     reverse(nums,0,n-1);
    //     reverse(nums,0,k-1);
    //     reverse(nums,k,n-1);
        
    // }
    // private void reverse(int[] nums,int start,int end){
    //     while(start < end){
    //         int temp = nums[start]; 
    //         nums[start]= nums[end];
    //         nums[end]= temp;
    //         start++;
    //         end--;
    //     }
    if(nums.length == 0)return;
    k = k%nums.length;
    if(k == 0)return;
    int temp[]  = new int[nums.length];
    int j = 0;
    for(int i = nums.length-k ;i < nums.length;i++){
        temp[j++] = nums[i];
    }
    for(int i = 0 ; i < nums.length-k ;i++){
        temp[j++] = nums[i];
    }
    for(int i = 0 ; i < temp.length;i++){
        nums[i] = temp[i];
    }
    }
}