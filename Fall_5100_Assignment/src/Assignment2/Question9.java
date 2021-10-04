package Assignment2;

//Reverse words in a String-https://leetcode.com/problems/reverse-words-in-a-string/
// Given an input strings, reverse the order of the words.A word is defined as a sequence of non-space characters. The words ins will be separated by at least one space.Returna string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words.
// The returned string should only have a single space separating the words.
// Do not include any extra spaces.Example 1:Input:s = "the sky is blue"Output:"blue is sky the"
// Example 2:Input:s = "  hello world  "Output:"world hello"Explanation:Your reversed string should not contain leading or trailing spaces.
//Example 3:Input:s = "a good   example"Output:"example good a"Explanation:You need to reduce multiple spaces between two words to a single space in the reversed string.
// Example 4:Input:s = "  Bob    Loves  Alice   "Output:"Alice Loves Bob"Example 5:Input:s = "Alice does not even like bob"Output:"bob like even not does Alice"
// Constraints:•1 <= s.length <= 104•scontains English letters (upper-case and lower-case), digits, and spaces' '.•There isat least oneword ins.

public class Question9 {
    public static void main(String[] args) {
       String s1 = "the sky is blue";
       System.out.println(reverseWords(s1));
       String s2 = " hello world  ";
       System.out.println(reverseWords(s2));
       String s3 = "a good example";
       System.out.println(reverseWords(s3));
       String s4 = "  Bob    Loves  Alice   ";
       System.out.println(reverseWords(s4));
       String s5 = "Alice does not even like bob";
       System.out.println(reverseWords(s5));

    }
    // Time Complexity O(n)
    // Space Complexity O(n)
    public static String reverseWords(String s){
        String[] stringArray = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = stringArray.length-1; i>=0; i--){
            sb.append(stringArray[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
