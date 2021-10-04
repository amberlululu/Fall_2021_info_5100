package Assignment2;
import java.util.*;
//6)Isomorphic Strings-https://leetcode.com/problems/isomorphic-strings/
// Given two strings and t,determine if they are isomorphic.Two strings and t are isomorphic
// if the characters in scan be replaced to get t.All occurrences of a character must be replaced with another character while preserving the order of characters.
// No two characters may map to the same character, but a character may map to itself.
// Example 1:Input:s = "egg", t = "add"Output:true
// Example 2:Input:s = "foo", t = "bar"Output:false
// Example 3:Input:s = "paper", t = "title"Output:true
// Constraints:•1 <= s.length <= 5 * 104•t.length == s.length•s and t consist of any valid ascii character.

public class Question6 {
    public static void main(String[] args) {
        String s1 = "egg", t1 = "add";
        System.out.println(isIsomorphic(s1, t1));
        String s2 = "foo", t2 = "bar";
        System.out.println(isIsomorphic(s2, t2));
        String s3 = "paper", t3 = "title";
        System.out.println(isIsomorphic(s3, t3));


    }

    // Time Complexity O(n)
    // Space Complexity O(n)

    public static boolean isIsomorphic(String s, String t){
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            char str1  = s.charAt(i);
            char str2 = t.charAt(i);
            if(!map.containsKey(str1)){

                if(map.containsValue(str2)){
                    return false;
                }
                map.put(str1, str2);
            }else{
                if(map.get(str1)!= str2){
                    return false;
                }
            }

        }
        return true;

    }

}
