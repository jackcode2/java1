
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        // fast ���� null����ʾ������������ null
        // fast == slow����ʾ������������
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
        // ��������
        // ���������� null����ʾû�л���ֱ�ӷ��� null
        // ��������� + ����������������
        ListNode p = head;
        ListNode q = slow;
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        
        return p;
    }
}