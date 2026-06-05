package org.example.easy;

class MergeTwoSortedLists_21 {
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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));

        ListNode l2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));

        ListNode l3 = new ListNode();

        printList(mergeTwoLists(l1, l2));

    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode answer = new ListNode();
        ListNode current = answer;


        System.out.println("answer addr: " + answer);
        System.out.println("current addr: " + current);

        while (list1 != null && list2 != null) {
            printList(list1);
            printList(list2);
            System.out.println("answer looks: ");
            printList(answer);
            System.out.println("current looks: ");
            printList(current);
            System.out.println("______________");

            if (list1.val < list2.val) {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            current = current.next;

            System.out.println("answer addr: " + answer);
            System.out.println("current addr: " + current);
        }

        while (list1 != null) {
            current.next = new ListNode(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            current.next = new ListNode(list2.val);
            list2 = list2.next;
        }

        System.out.println("RESULT answer:");
        printList(answer);
        int i = 0;
        while (answer != null) {
            System.out.println(i + "th node address: " + answer );
            i++;
            answer = answer.next;
        }
        System.out.println();
        System.out.println("RESULT current:");
        printList(current);

        return answer.next;
    }
}

