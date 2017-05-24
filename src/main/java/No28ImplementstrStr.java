/**
 * Created by gaowei16 on 17/5/24.
 */
public class No28ImplementstrStr {

    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0)
            return 0;
        if (haystack == null || haystack.length() == 0) {
            return -1;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int n = i;
            for (int j = 0; j < needle.length(); j++,n++) {
                if (haystack.charAt(n) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1)
                    return i;
            }
        }
        return -1;
    }
}
