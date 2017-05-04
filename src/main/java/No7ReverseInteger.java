/**
 * Created by gaowei16 on 17/5/4.
 * Desc: Reverse digits of an integer.
 *      The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 */
public class No7ReverseInteger {
    /**
     * 需要考虑边界条件,反转后的int可能大于int的最大值
     * */
    public int reverse(int x) {
        boolean flag = true;
        if (x < 0) {
            flag = false;
            x = -x;
        }
        long y = 0;
        while (x > 0) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        if (y > Integer.MAX_VALUE) {
            return 0;
        }
        return flag? (int)y : (int)(-y);
    }

    public static void main(String[] args) {
        int x = -2147483412;
        System.out.println(new No7ReverseInteger().reverse(x));
    }

}
