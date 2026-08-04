import java.util.*;
public class linkedlist {
    boolean isPlaindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
        }
    }
}

