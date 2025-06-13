class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words = (s1 + " " + s2).split(" ");
        HashMap<String,Integer> mp = new HashMap<>();

        for(String word : words){
            mp.put(word,mp.getOrDefault(word,0)+1);
        }

        ArrayList<String> amp = new ArrayList<>();

        for(String wor : mp.keySet()){
            if(mp.get(wor) == 1){
                amp.add(wor);
            }
        }
        return amp.toArray(new String[0]);
    }
}