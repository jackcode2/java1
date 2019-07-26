 Node merge(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
       }
        if (head2 == null) {
            return head1;
        }
        Node result = null;
        Node last = null;    last指的是result的最后一个结点
        Node cur1 = head1;
        Node cur2 = head2;
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                if (result == null) {
                    result = cur1;
                } else {
                    last.next = cur1;
                }
                last = cur1;
                cur1 = cur1.next;
            } else {
                if (result == null) {
                    result = cur2;
                } else {
                    last.next = cur2;
                }
                last = cur2;
                cur2 = cur2.next;
            }
        }
        if (cur1 != null) {
            last.next = cur1;
        } else {
            last.next = cur2;
        }
        return result;
    }
