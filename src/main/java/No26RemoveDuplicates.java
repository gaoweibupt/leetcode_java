/**
 * Created by gaowei16 on 17/5/22.
 */
public class No26RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int result = 1;
        int back = nums[0];
        int pos = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != back) {
                back = nums[i];
                result++;
                if (pos != i)
                    swap(nums, pos, i);
                pos++;
            }
        }
        return result;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
