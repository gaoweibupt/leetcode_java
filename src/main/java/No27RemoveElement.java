/**
 * Created by gaowei16 on 17/5/22.
 */
public class No27RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int result = 0;
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (pos != i) {
                    swap(nums, i, pos);
                }
                pos++;
                result++;
            }
        }
        return result;
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
