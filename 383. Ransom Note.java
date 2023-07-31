//383. Ransom Note

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ans = new int[26];
        Arrays.fill(ans, 0);
        for (char x : magazine.toCharArray()) {
            ans[x - 'a']++;
        }
        for (char x : ransomNote.toCharArray()) {
            int i = (int) (x - 'a');
            if (ans[i] == 0) {
                return false;
            }
            ans[i]--;
        }
        return true;
    }
}