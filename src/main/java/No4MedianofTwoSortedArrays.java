/**
 * Created by gaowei on 2017/5/2.
 * Desc:There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *      Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 */
public class No4MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = sort(nums1, nums2);
        int len = nums1.length + nums2.length;
        if (len % 2 == 0) {
            return (result[len / 2 - 1] + result[len / 2]) / 2.0;
        }
        else {
            return result[len / 2];
        }

    }

    private static int[] sort(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0)
            return nums2;
        if (nums2 == null || nums2.length == 0)
            return nums1;
        int length = nums1.length + nums2.length;
        int result[] = new int[length];
        int i = 0, j = 0, l = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[l] = nums1[i];
                i++;l++;
            }
            else {
                result[l] = nums2[j];
                j++;l++;
            }
        }
        while (i < nums1.length) {
            result[l] = nums1[i];
            i++; l++;
        }
        while (j < nums2.length) {
            result[l] = nums2[j];
            j++; l++;
        }
        return result;
    }

}
