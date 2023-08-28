public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode turtle = head;
        ListNode rabbit = head;

        while (rabbit != null && rabbit.next != null) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;

            if (rabbit == turtle) {
                return true;
            }
        }
        return false;        
    }
}