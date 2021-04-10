package org.example;

public class AddTwoNumberFromReverseSinglyLinkedList {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(8);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode4;
        listNode4.next = listNode3;

        ListNode listNode5 = new ListNode(5);
//        ListNode listNode6 = new ListNode(6);
//        ListNode listNode44 = new ListNode(4);
//        listNode5.next = listNode6;
//        listNode6.next = listNode44;

        /**
         * 输入：l1 = [2,4,3], l2 = [5,6,4]
         * 输出：[7,0,8]
         * 解释：342 + 465 = 807.
         *
         */
        ListNode soulution = soulution(listNode2, listNode5);
        System.out.println(1);
    }

    public static ListNode soulution(ListNode l1,ListNode l2){

        ListNode dummyHeader = new ListNode(-1);
        ListNode pre = dummyHeader;
        //进位标记
        int t= 0 ;

        while(l1!=null || l2!=null || t!=0){
            int a = l1 == null?0:l1.val;
            int b = l2 == null?0:l2.val;

            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            int sum = a+b+t;
            t = sum /10;//除10取整
            pre.next = new ListNode(sum%10);//取余设值
            pre = pre.next;
        }

        return dummyHeader.next;
    }
}
