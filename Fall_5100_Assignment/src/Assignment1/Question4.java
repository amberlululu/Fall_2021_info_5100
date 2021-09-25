package Assignment1;
import java.util.*;
//Question 4:
//        Given two stings ransomNote and magazine, return true if ransomNote can be constructed
//        from magazine and false otherwise.
//        Each letter in magazine can only be used once in ransomNote.
//        Example 1:
//        Input: ransomNote = "a", magazine = "b"
//        Output: false
//        Example 2:
//        Input: ransomNote = "aa", magazine = "ab"
//        Output: false
//        Example 3:
//        Input: ransomNote = "aa", magazine = "aab"
//        Output: true

public class Question4 {
    public static void main(String[] args) {
        String r1 ="a";
        String m1 = "b";
        System.out.println(MconstructsR(r1, m1));
        String r2 ="aa";
        String m2 = "ab";
        System.out.println(MconstructsR(r2, m2));
        String r3 ="aa";
        String m3 = "aab";
        System.out.println(MconstructsR(r3, m3));


    }

    // Time Complexity O(n)
    // Space Complexity O(26)
    public static boolean MconstructsR(String r, String m){
        if(r.length() > m.length()) return false;
        int[] map = new int[26];

        for(char c : m.toCharArray()){
            map[c-'a']++;
        }

        for(char c: r.toCharArray()){
            map[c-'a']--;
            if(map[c-'a'] <0){
                return false;
            }

        }
        return true;

    }
}
