/**
 * Created by gaowei16 on 17/5/4.
 * Desc: Implement atoi to convert a string to an integer.
 */
public class No8Atoi {

    /**
     * 边界条件:
     *      起始符号
     *      尾部符号
     *      int限制
     * */
    public int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;
        int i = 0;
        while (str.length() > i && str.charAt(i) == ' ')i++;
        long r = 0;
        int sign = 1;
        if (str.length() > i && str.charAt(i) == '+') {
            sign = 1; i++;
        }
        else if (str.length() > i && str.charAt(i) == '-') {
            sign = -1; i++;
        }
        while (str.length() > i && str.charAt(i) - '0' <= 9 && str.charAt(i) - '0' >= 0) {
            r = r * 10 + str.charAt(i++) - '0';
            if (sign < 0) {
                if (-r < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }
            else {
                if (r > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
            }
        }
        return sign>0? (int) r:(int) -r;
    }


    public static void main(String[] arg) {
        String s = "010";
        System.out.println(new No8Atoi().myAtoi(s));
    }
}
