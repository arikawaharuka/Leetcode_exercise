package Easy;

import java.util.HashMap;
import java.util.Map;

public class SumTwoNumber_0001 {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j=i+1;j<nums.length;j++){
                if (target==nums[i]+nums[j]){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSumHash(int[] nums, int target){
        int[] result=new int[2];
        Map<Integer,Integer> hashMap= new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (hashMap.containsKey(target-nums[i])){
                result[0]=hashMap.get(target-nums[i]);
                result[1]=i;
                return result;
            }
            hashMap.put(nums[i],i);
        }
        return result;
    }

}
