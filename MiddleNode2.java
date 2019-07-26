class Solution {
    public ListNode middleNode(ListNode head) {
	Node fast=null;
	Node slow=null;
	while(fast!=null)
	{
	fast=fast.next;
	if(fast==null)
	{
	break;
	}
fast=fast.next;
slow=slow.next;
}
return slow;
}