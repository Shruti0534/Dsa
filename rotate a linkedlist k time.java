class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head; // No rotation needed for an empty list, single-node list, or k = 0
        }
        
        // Step 1: Calculate the length of the list
        ListNode current = head;
        int length = 1; // Start at 1 since we are counting nodes
        while (current.next != null) {
            current = current.next;
            length++;
        }

        // Step 2: Update k to avoid unnecessary rotations
        k = k % length;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Step 3: Connect the tail to the head to form a circular list
        current.next = head; // Connect the last node to the first node

        // Step 4: Find the new head and the new tail
        int stepsToNewHead = length - k; // Number of steps to reach the new head
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) { // Stop one step before the new head
            newTail = newTail.next;
        }

        // Step 5: Break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead; // Return the new head of the rotated list
    }
}
