import java.util.*;

public class Solution {

    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        // Add first time, remove second time
        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        int[] result = new int[2];
        int index = 0;

        // Extract values without for-each
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            result[index++] = it.next();
        }

        return result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 2, 1, 3, 2, 5};

        int[] ans = obj.singleNumber(nums);

        System.out.println("The two single numbers are: " + ans[0] + " and " + ans[1]);
    }
}
