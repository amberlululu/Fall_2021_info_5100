package Question2;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res  = GroupAna(strs);

        for(List<String> re : res){
            System.out.println("[");
            for(String s : re){
                System.out.println(s);
            }
            System.out.println("]");
        }


    }
    public static List<List<String>> GroupAna(String[] strs){
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] sArray = str.toCharArray();
            Arrays.sort(sArray);
            String base = new String(sArray);
            if(!map.containsKey(base)){
                map.put(base, new ArrayList<>());
            }
            map.get(base).add(str);

        }

        res.addAll(map.values());
        return res;

    }

}
