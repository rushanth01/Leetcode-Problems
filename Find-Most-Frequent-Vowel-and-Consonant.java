class Solution {
    public int maxFreqSum(String s) {
        if(s.length() == 0)
        return 0;
        Map<Character,Integer> mp = new HashMap<>();

        for(int i = 0 ; i < s.length();i++){
           char ch = s.charAt(i);
           mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int res = 0;
        int res1 = 0;
        for(char ch : mp.keySet()){
            if(ch == 'a'|| ch=='e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
              res = Math.max(res,mp.get(ch));
            }
            else{
                res1 = Math.max(res1,mp.get(ch));
            }
        }
        return res+res1;
    }
}