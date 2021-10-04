package Assignment2;
import java.util.*;

//2)Shortest Word Distance : https://leetcode.com/problems/sign-of-the-product-of-an-array/
// Given an array of strings wordsDict and two different strings that already exist in the array word1 and word2,
// return the shortest distance between these two words in the list.
// Example 1:Input:wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "coding", word2 = "practice"Output:3
// Example 2:Input:wordsDict= ["practice", "makes", "perfect", "coding", "makes"], word1 = "makes", word2 = "coding"Output:1
// Constraints:•1 <= wordsDict.length <= 3 * 104•1 <= wordsDict[i].length <= 10•wordsDict[i]consists of lowercase English letters.•word1andword2are inwordsDict.•word1 != word2

public class Question2 {
    public static void main(String[] args) {
        String[] wordDict1 = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding", word2 = "practice";
        System.out.println(shortestWordDistance(wordDict1,word1,word2));
        String word3 = "makes", word4 = "coding";
        System.out.println(shortestWordDistance(wordDict1,word3,word4));
        String[] wordDict2 = {"a","a","b","b"};
        String word5 = "a", word6 = "b";
        System.out.println(shortestWordDistance(wordDict2,word5,word6));


    }

    // Time Complexity O(n)
    // Space Complexity O(1)

    public static int shortestWordDistance(String[] wordsDict, String word1, String word2){
        int left = -1;
        int right = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < wordsDict.length; i++){
            if(wordsDict[i].equals(word1)){
                left = i;
            }
            if(wordsDict[i].equals(word2)){
                right = i;
            }
            if(left!= -1 && right!= -1){
                min = Math.min(min, Math.abs(left-right));
            }

        }
        return min;
    }
}
