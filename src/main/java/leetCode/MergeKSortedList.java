package leetCode;

public class MergeKSortedList {

    public static void main(String[] args) {

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }

        return sortByPartition(lists, 0 , lists.length-1);
    }

    public static ListNode sortByPartition(ListNode[] lists, int start, int end){

        if(start == end){
            return lists[start];
        }

        int mid = (start + end)/2;
        ListNode left = sortByPartition(lists, 0, mid);
        ListNode right = sortByPartition(lists, mid + 1, end);

        return merge(left, right);

    }


    public static ListNode merge(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 == null)
            curr.next = l2;
        if (l2 == null)
            curr.next = l1;
        return dummy.next;
    }

    //TODO: solve using priority queue


    private static class ListNode{

        int val;
        ListNode next;

        ListNode(int x){
            val = x;
        }
    }

}
