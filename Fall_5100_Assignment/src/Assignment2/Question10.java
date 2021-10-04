package Assignment2;
//10)String Compression-https://leetcode.com/problems/string-compression/
// Given an array of characters chars, compress it using the following algorithm:Begin with an empty strings.
// For each group of consecutive repeating characters in chars:•If the group's length is1, append the character tos.•Otherwise, append the character followed by the group's length.
// The compressed strings should not be returned separately, but instead, be stored in the input character array chars.
// Note that group lengths that are10or longer will be split into multiple characters in chars.After you are done modifying the input array, return the new length of the array.
// You must write an algorithm that uses only constant extra space.
// Example 1:Input:chars = ["a","a","b","b","c","c","c"]
 //Output:Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
// Explanation:The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
// Example 2:Input:chars = ["a"]Output:Return 1, and the first character of the input array should be: ["a"]
// Explanation:The only group is "a", which remains uncompressed since it's a single character.
// Example 3:Input:chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]Output:Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
// Explanation:The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
// Example 4:Input:chars = ["a","a","a","b","b","a","a"]Output:Return 6, and the first 6 characters of the input array should be: ["a","3","b","2","a","2"].
// Explanation:The groups are "aaa", "bb", and "aa". This compresses to "a3b2a2". Note that each group is independent even if two groups have the same character.
// Constraints:•1 <= chars.length <= 2000•chars[i]is a lowercase English letter, uppercase English letter, digit, or symbol.

public class Question10 {
    public static void main(String[] args) {
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars1));
        char[] chars2 = {'a'};
        System.out.println(compress(chars2));
        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(chars3));
        char[] chars4 = {'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        System.out.println(compress(chars4));


    }
    // Time Complexity O(n)
    // Space Complexity O(1)

    public static int compress(char[] chars){
        int index = 0;

        int i = 0;
        while(i < chars.length){
            int j = i;
            while(j < chars.length && chars[i] == chars[j]){
                j++;
            }

            chars[index] = chars[i];
            index++;

            if(j-i >1){
                String s =  j-i +"";
                for(char num : s.toCharArray()){
                    chars[index] = num;
                    index++;
                }
            }

            i = j;

        }
        return index;
    }
}
