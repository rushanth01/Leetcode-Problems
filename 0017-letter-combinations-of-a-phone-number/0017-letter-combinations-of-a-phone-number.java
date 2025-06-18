class Solution {
    public List<String> letterCombinations(String digits) {
       if(digits == "null" || digits.length() == 0)
       return new ArrayList<>();

       List<String> result = new ArrayList<>(); 
       
       String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

       result.add("");

       for(char digitchar : digits.toCharArray()){
        int digit = digitchar - '0';
        String letters = map[digit];

        List<String> templist = new ArrayList<>();

        for(String combination : result){
            for(char letter : letters.toCharArray()){
                templist.add(combination+letter);
            }
        }
        result = templist;
       }
       return result;    
    }
}