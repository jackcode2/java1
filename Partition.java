public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // < x
        ListNode less = null;
        ListNode lessLast = null;
        
        // >= x
        ListNode great = null;
        ListNode greatLast = null;
        
        ListNode cur = pHead;
        while (cur != null) {
            if (cur.val < x) {
                if (less == null) {
                    less = cur;
                } else {
                    lessLast.next = cur;
                }
                lessLast = cur;
            } else {
                if (great == null) {
                    great = cur;
                } else {
                    greatLast.next = cur;
                }
                greatLast = cur;
            }
                
            cur = cur.next;
        }
        
        if (less == null) {
            return great;
        } else {
            lessLast.next = great;
            if (greatLast != null) {
                greatLast.next = null;
            }
            
            return less;
        }
    }
}