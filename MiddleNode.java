class Solution {
    private int getLength(ListNode head) {
	int len=0;
	for(ListNode cur=head;cur!=null;cur=cur.next)
	{
	len++;
	}
	return len;
	}
	public ListNode middleNode(ListNode head) {
	int len=getLength(head);
	int midlen=len/2;
	for(int i=0;i<midlen;i++)
	{
	node=node.next;
	}
	return node;
	}