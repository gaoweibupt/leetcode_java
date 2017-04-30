/**
 * Created by gaowei16 on 17/4/30.
 * Desc: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *       You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class No1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return null;
    }

    public static void main(String[] arg) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] result = new No1TwoSum().twoSum(nums, target);
        for (int x: result) {
            System.out.println(x);
        }


    }
}
