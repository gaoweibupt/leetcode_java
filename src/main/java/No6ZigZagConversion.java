/**
 * Created by gaowei16 on 17/5/3.
 * Desc:
 */
public class No6ZigZagConversion {

    public String convert(String s, int numRows) {
        if (s == null || s.length() == 1 || numRows == 1)
            return s;
        int length = numRows * 2 - 2;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) {
                int j = 0;
                while (s.length() > j * length + i) {
                    sb.append(s.charAt(j * length + i));
                    j++;
                }
            }
            else {
                int j = 0;
                while (s.length() > j * length + i) {
                    sb.append(s.charAt(j * length + i));
                    if ( ((j+1) * length - i) < s.length())
                        sb.append(s.charAt((j+1) * length - i));
                    j++;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        String result = new No6ZigZagConversion().convert(s,3);
        System.out.println(result);
    }



}
