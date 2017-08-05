import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] sol = new int[2];

        for (int i = 0; i < nums.length; i++ ) {

            if (map.containsKey(target - nums[i])) {
                sol[0] = i;
                sol[1] = map.get(target - nums[i]);
                return sol;
            }

            map.put(nums[i], i);
        }

        return sol;


    }


    public static void main(String args[]) {
        Solution solution = new Solution();

        int[] nums = new int[]{3, 2, 4};

        int[] sol = solution.twoSum(nums, 6);
        for (int i =0; i < sol.length; i++) {
            System.out.print(sol[i] + " ");
        }
    }
}