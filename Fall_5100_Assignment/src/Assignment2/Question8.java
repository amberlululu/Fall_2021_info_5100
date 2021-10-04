package Assignment2;
//8)Valid Palindrome-https://leetcode.com/problems/valid-palindrome/
// Given a strings, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//Example 1:Input:s = "A man, a plan, a canal: Panama"Output:trueExplanation:"amanaplanacanalpanama" is a palindrome.
// Example 2:Input:s = "race a car"Output:falseExplanation:"raceacar" is not a palindrome.
// Constraints:•1 <= s.length <= 2 * 105•s consists only of printable ASCII characters

public class Question8 {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "a";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));


    }

    // Time Complexity O(n)
    // Space Complexity O(1)
    public static boolean isPalindrome(String str){
        if(str.length() ==1){
            return true;
        }
        int left =  0;
        int right  = str.length()-1;
        while(left <= right){
            while(!Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            while(!Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(str.charAt(left))!= Character.toLowerCase(str.charAt(right))){
                return false;
            }else{
                left++;
                right--;
            }

        }
        return true;
    }
}
