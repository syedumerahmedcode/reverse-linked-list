public class Solution {

    public ListNode reverseList(ListNode head) {

        /**
         * We will keep having a previous node in addition to the current node
         */
        ListNode previous = null;
        ListNode current = head;

        /**
         * iterate over the linked list
         */
        while (current != null) {
            /**
             * Here we flip the values of current and previous
             */
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        /**
         * Outside the loop, the linked list is already reversed.
         */
        return previous;

    }

}
