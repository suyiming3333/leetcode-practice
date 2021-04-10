package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int [] nums = {2,4,4,6, 11, 15};
        int targetSum = 8;
        soulution(nums,targetSum);
    }

    public static int[] soulution(int[] nums,int target){
        Map<Integer,Integer> tmpMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //哈希查找的时间复杂度为 O(1)O(1)，所以可以利用哈希容器 map 降低时间复杂度
            //遍历数组元素，判断map是否存在存在一个值x满足x+nums[i]=target
            if(tmpMap.containsKey(target-nums[i])){
                System.out.println("满足条件的元素下标为：{"+tmpMap.get(target-nums[i])+","+i+"}");
                return new int[]{i,tmpMap.get(target-nums[i])};
            }
            //否则放入到map
            tmpMap.put(nums[i],i);
        }

        throw new RuntimeException("找不到对应的数");
    }
}
