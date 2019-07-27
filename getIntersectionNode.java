public class Node{   输入两个链表，找出它们的第一个公共结点。
Node next=null;
 int val=0;
 Node(val){
this.val=val;
}
public class Solution {
    private int getLength(ListNode head) {
	int len=0;
	for(Node cur=head;cur!=null;cur=cur.next)
	{
	len++;
	}
	return len;
	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	int lenA=getLength(handA);
	int lenB=getlength(handB);
	ListNode longer=handA;
	ListNode shorter=handB;
	int diff=(lenA-lenB);
	if(lenA<lenB)
	{
	longer =handA;
	shorter=handB;
	diff=(lenA-lenB);
	}
	for(int i=0;i<diff;i++)
	{
	longer=longer.next;
	}
	while(longer!=shorter)
	{
	longer=longer.next;
	shorter=shorter.next;
	}
	return longer;
	}
	