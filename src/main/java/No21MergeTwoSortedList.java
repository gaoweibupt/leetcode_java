/**
 * Created by gaowei on 2017/5/7.
 */
public class No21MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tmp = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tmp.next = new ListNode(l1.val);
                l1 = l1.next;
                tmp = tmp.next;
            }
            else {
                tmp.next = new ListNode(l2.val);
                l2 = l2.next;
                tmp = tmp.next;
            }
        }
        if (l1 != null) {
            tmp.next = l1;
        }
        if (l2 != null) {
            tmp.next = l2;
        }
        return head.next;
    }

    public static void main(String[] args) {

    }
}

