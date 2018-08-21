package leetCode;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

    /*public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        if (length1 < length2) return findMedianSortedArrays(nums2, nums1);

        int lo = 0;
        int hi = length2 * 2;
        while (lo <= hi) {
            int cut2 = (lo + hi) / 2;
            int cut1 = length1 + length2 - cut2;

            double L1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[(cut1 - 1 ) / 2];
            double L2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[(cut2 - 1 ) / 2];
            double R1 = (cut1 == length1 * 2) ? Integer.MAX_VALUE : nums1[cut1 / 2];
            double R2 = (cut2 == length2 * 2) ? Integer.MAX_VALUE : nums2[cut2 / 2];

            if (L1 > R2) lo = cut2 + 1;
            else if (L2 > R1) hi = cut2 - 1;
            else return (Math.max(L1, L2) + Math.min(R1, R2)) / 2;
        }
        return -1;
    }*/


    //TODO: write and explanation for this one
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;

        return (findKth(nums1, 0, nums2, 0, l) + findKth(nums1, 0, nums2, 0, r)) / 2;
    }

    public static double findKth(int[] A, int Astart, int[] B, int Bstart, int k) {
        if (Astart >= A.length) {
            return B[Bstart + k - 1];
        }
        if (Bstart >= B.length) {
            return A[Astart + k - 1];
        }
        if (k == 1) {
            return Math.min(A[Astart], B[Bstart]);
        }
        int Amid = Integer.MAX_VALUE, Bmid = Integer.MAX_VALUE;
        if (Astart + k/2 -1 < A.length) {
            Amid = A[Astart + k/2 - 1];
        }
        if (Bstart + k/2 -1 < B.length) {
            Bmid = B[Bstart + k/2 - 1];
        }
        if (Amid < Bmid) {
            return findKth(A, Astart + k/2, B, Bstart, k - k/2);
        } else {
            return findKth(A, Astart, B, Bstart + k/2, k - k/2);
        }


    }

}
