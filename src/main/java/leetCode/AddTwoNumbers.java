package leetCode;

public class AddTwoNumbers {

    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = 0, y = 0;
            if(p!=null){
                x = p.val;
                p = p.next;
            }
            if(q!=null){
                y = q.val;
                q = q.next;
            }
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }


    private static class ListNode{

        int val;
        ListNode next;

        ListNode(int x){
            val = x;
        }
    }
}
