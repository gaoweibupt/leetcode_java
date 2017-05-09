/**
 * Created by gaowei16 on 17/5/8.
 */
public class No69Sqrt {
    public int mySqrt(int x) {
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }
}
