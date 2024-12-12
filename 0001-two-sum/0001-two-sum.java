class Solution {
    public int[] twoSum(int[] num, int target) {
        for(int i =0;i<num.length;i++){
            for(int j = i+1;j<num.length;j++){
                if(target==num[i]+num[j])
                return new int[]{i,j};
            }
        }
        
   
    return null;
 }
}