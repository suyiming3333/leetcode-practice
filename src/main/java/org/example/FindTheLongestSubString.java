package org.example;

import java.util.HashMap;
import java.util.Map;

public class FindTheLongestSubString {

    public static void main(String[] args) {
        String str = "pwwkew";
        char[] chars = str.toCharArray();

        Map<Character,Integer> tmpMap = new HashMap<>();
        int i = 0;
        int start = 0;
        int end = 0;
        int result = 0;
        while(i<chars.length){
            //找到重复的元素
            if(tmpMap.containsKey(chars[i])){
                //start指针向右移动
                start = tmpMap.get(chars[i])+1;
                end = start;
            }else{
                end = i;
            }
            tmpMap.put(chars[i],i);
            result = Math.max(result,end-start+1);
            i++;
        }

        System.out.println(result);
    }
}
