class Solution {
    public int[] sortArrayByParity(int[] nums) { 
        ArrayList<Integer> list = new ArrayList<>();
      for(int num : nums){
        if(num % 2 == 0){
            list.add(num);
        }
      }
      for(int num : nums){
        if(num % 2 != 0){
            list.add(num);
        }
      }
      int result[] = new int[list.size()];
      for(int i = 0 ; i < list.size();i++){
        result[i] = list.get(i);
      } 
      return result; 
    }
}