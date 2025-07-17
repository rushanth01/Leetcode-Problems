class Solution {
    public int longestPalindrome(String s) {
        int count  = 0;
        int oddcount = 0;
        Map<Character,Integer> mp= new HashMap<>();
        for(char c : s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(char c : mp.keySet()) {
            if(mp.get(c) % 2 != 0){
            count += mp.get(c) -1 ;
            oddcount++;
            }
            else
            count += mp.get(c);    
            
        }
        return oddcount!=0?count+1:count ; 
    }
}