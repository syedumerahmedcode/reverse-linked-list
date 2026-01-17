public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Given the head of a singly linked list, reverse the list, and return the
         * reversed list.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: head = [1,2,3,4,5]
         * Output: [5,4,3,2,1]
         * 
         * Example 2:
         * 
         * Input: head = [1,2]
         * Output: [2,1]
         * 
         * Example 3:
         * 
         * Input: head = []
         * Output: []
         */
        System.out.println("Hello, World!");
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode result = solution.reverseList(head);

        System.out.println("The original given linked list is: ");
        printList(head);

        System.out.println("The reversed linked list is: ");
        printList(result);

    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
