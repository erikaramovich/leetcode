package org.example.medium;

public class AddTwoNumbers_2 {
    public static void main(String[] args) {
        ListNode num1 = new ListNode(5, new ListNode(0, new ListNode(6))); //605
        ListNode num2 = new ListNode(5, new ListNode(0, new ListNode(4))); //405
        printList(num1); // prints reversed 506
        printList(num2); // prints reversed 504
        ListNode answer = addTwoNumbers(num1, num2); // 605 + 405 = 1010
        printList(answer); // prints reversed 0101
    }


    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static void printList(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
        System.out.println();
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;
        while (l1 != null || l2 != null) {

            // Null handling
            int x = (l1 == null) ? 0: l1.val;
            int y = (l2 == null) ? 0: l2.val;

            // take account of old carry and include in new carry also
            int sum = x + y + carry;

            // get the digit
            int digit = sum % 10;
            // get the new carry
            carry = sum / 10;

            // move forward
            current.next = new ListNode(digit);
            current = current.next;

            // safe forwarding the numbers
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }

        // if carry is left over, add it to the end (append a final node)
        if(carry > 0){
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }

}
