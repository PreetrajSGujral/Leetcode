public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode leftHead = null;
        ListNode temp = null;

		// find the middle of the list and reverse left part
        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
            temp.next = leftHead;
            leftHead = temp;
        }

        if (fast != null) {
            slow = slow.next;
        }

       // check if there are any not equal elements
        while (leftHead != null && slow != null) {
            if (leftHead.val != slow.val) return false;
            leftHead = leftHead.next;
            slow = slow.next;
        }
        return true;
    }
