class Solution {
  //Swap of two nodes 
  //a->b->c->d-> return b->a->d->c
    public ListNode swapPairs(ListNode head) {
        // Step 1: Create a dummy node to make swapping the head easier
        ListNode dummy = new ListNode(-1);
        dummy.next = head; // The dummy points to the head of the list
        
        // Step 2: Initialize pointers
        ListNode prev = dummy; // 'prev' helps track the node before the current pair

        // Step 3: Traverse the list in pairs
        while (prev.next != null && prev.next.next != null) {
            // Identify the two nodes to swap
            ListNode first = prev.next; // First node in the pair
            ListNode second = prev.next.next; // Second node in the pair

            // Step 4: Perform the swap
            first.next = second.next; // First points to the node after the second
            second.next = first;      // Second points to the first
            prev.next = second;       // Previous node points to the second (now the first in the pair)

            // Step 5: Move pointers for the next pair
            prev = first; // 'prev' advances to the end of the current swapped pair
        }

        // Step 6: Return the new head
        return dummy.next;
    }
}
