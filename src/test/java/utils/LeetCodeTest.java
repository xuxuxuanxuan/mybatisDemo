package utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: sean.xu
 * @Date: 2020/4/30
 */
public class LeetCodeTest {

    public static void main(String[] args) {
        int[] nums = new  int[]{2,7,11,15};
        int target = 18;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i< nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
