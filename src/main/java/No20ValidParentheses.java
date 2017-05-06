import java.util.Stack;

/**
 * Created by gaowei on 2017/5/6.
 */
public class No20ValidParentheses {

    public boolean isValid(String s) {
        if (s == null)
            return true;
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.add(s.charAt(i));
            }
            if (s.charAt(i) == ')') {
                if (st.empty() || st.pop() != '(')
                    return false;
            }
            if (s.charAt(i) == '}') {
                if (st.empty() || st.pop() != '{') {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                if (st.empty() || st.pop() != '[')
                    return false;
            }
        }
        if (st.empty())
            return true;
        return false;
    }
}
