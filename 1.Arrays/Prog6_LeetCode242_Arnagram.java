/**
 * Prog6_LeetCode242_Arnagram
 */
public class Prog6_LeetCode242_Arnagram {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println("IsArnagram : "+ isArnagram(s,t));
    }
    static boolean isArnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int[] store = new int[26];
        for(int i = 0; i < s.length(); i++){
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }
        for(int i : store){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}