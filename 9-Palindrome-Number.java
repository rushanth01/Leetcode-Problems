class Solution {
    public boolean isPalindrome(int x) {
        String isPalindrome =Integer.toString(x); 
        int L=0,R=isPalindrome.length()-1;
        while(L<R){
            char start=isPalindrome.charAt(L);
            char end=isPalindrome.charAt(R);
            if(start!=end)
            return false;
            else
            L++;
            R--;
        }
        return true;
}
}