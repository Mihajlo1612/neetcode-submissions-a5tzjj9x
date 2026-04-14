class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] solution = new int[26];

        for(int i = 0; i < s.length(); i++) {
            solution[s.charAt(i) - 'a']++;
            solution[t.charAt(i) - 'a']--;
        }

        for(int c : solution) {
            if(c != 0) return false;
        }
        return true;
    }
}
