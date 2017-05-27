/**
 * Created by gaowei16 on 17/5/27.
 */
public class No35SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return i;
    }
}
