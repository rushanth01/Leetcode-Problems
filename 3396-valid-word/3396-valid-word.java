class Solution {
    public boolean isValid(String word) {

        if (word.length() < 3) return false;

        int vowelCount = 0;      
        int consonantCount = 0;  

        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false; 
            }
            else if(Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);  
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowelCount++;  // ✅ Count vowel
                } else {
                    consonantCount++;  // ✅ Count consonant
                }
            }
        }
        return vowelCount >= 1 && consonantCount >= 1;
    }
}
