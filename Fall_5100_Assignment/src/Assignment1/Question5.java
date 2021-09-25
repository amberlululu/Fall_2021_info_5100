package Assignment1;
import java.util.*;
//Question 5:
//        Letter followed by Digit: Given a string str write a function which will check if the string no
//        letter followed by another letter, and no digit followed by another digit.
//        For example: 1A3d4s5t
//        Result : True
//        Input: A2bb2d4
//        Result : False

public class Question5 {
    public static void main(String[] args) {
        String str1 = "A2bb2d4";
        String str2 = "B6g4c3";
        String str3 = "f77h3";
        System.out.println(notFollowedBySame(str1));
        System.out.println(notFollowedBySame(str2));
        System.out.println(notFollowedBySame(str3));

    }

    // Time Complexity O(n)
    // Space Complexity O(1)
    public static boolean notFollowedBySame(String str){
        for(int i = 0; i < str.length()-1; i++){
            if(Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i+1))){
                return false;
            }else if(Character.isAlphabetic(str.charAt(i)) && Character.isAlphabetic(str.charAt(i+1))){
                return false;
            }
        }
        return true;
    }
}
