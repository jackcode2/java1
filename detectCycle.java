
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        // fast 遇到 null，表示不带环，返回 null
        // fast == slow，表示遇到相遇点了
        do {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            slow = slow.next;
        } while (fast != slow);
        // 求相遇点
        // 如果快的遇到 null，表示没有环，直接返回 null
        // 相遇点出发 + 起点出发，最终相遇
        ListNode p = head;
        ListNode q = slow;
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        
        return p;
    }
}