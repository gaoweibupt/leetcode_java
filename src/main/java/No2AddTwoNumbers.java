/**
 * Created by gaowei16 on 17/5/1.
 * Desc:You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *      You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class No2AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        ListNode head = new ListNode(sum % 10);
        ListNode tmp = head;
        while (l1.next != null && l2.next != null) {
            sum = (l1.next.val + l2.next.val + sum / 10);
            l1 = l1.next;
            l2 = l2.next;
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
        }
        while (l1.next != null) {
            sum = (l1.next.val + sum / 10);
            l1 = l1.next;
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
        }
        while (l2.next != null) {
            sum = (l2.next.val + sum / 10);
            l2 = l2.next;
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
        }
        if (sum / 10 != 0) {
            tmp.next = new ListNode(sum / 10);
        }
        return head;
    }


}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
