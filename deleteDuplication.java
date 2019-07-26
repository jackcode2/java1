public class Solution {
    public ListNode deleteDuplication(ListNode pHead)删除重复结点
    {
		if (pHead == null) {
			return null;
		}
		
		ListNode prev = null;
        ListNode p1 = pHead;
        ListNode p2 = pHead.next;
        
        while (p2 != null) {
            if (p1.val != p2.val) {
                prev = p1;
                p1 = p2;
                p2 = p2.next;
            } else {
                while (p2 != null && p2.val == p1.val) {
                    p2 = p2.next;
                }
                
                if (prev == null) {
                    pHead = p2;
                } else {
                    prev.next = p2;
                }
                p1 = p2;
                if (p2 != null) {
                    p2 = p2.next;
                }
            }
        }
            
        return pHead;
    }
}












