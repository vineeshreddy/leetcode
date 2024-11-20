class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m + n];
        int i=0;
        int j=0;
        int k=0;
        double res = 0.0d;
        while (i<m && j<n) {
            if(nums1[i] <= nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
            } else {
                mergedArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        } 
        while (j < n) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }
        int indx = (m+n)/2;
        if((m+n) % 2 == 0) {
            res = mergedArray[indx] + mergedArray[indx-1];
            return (double) res/2;
        } else {
            return mergedArray[indx];
        }
    }
} 
