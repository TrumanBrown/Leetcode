class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1=nums1.length;
        int length2=nums2.length;
        int[] arr=new int[length1+length2];
        int i=0, j=0, k=0;
        while(i<length1 && j<length2)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        
        while(i<length1)
        {
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<length2)
        {
            arr[k]=nums2[j];
            j++;
            k++;
        }
        
        System.out.println(Arrays.toString(arr));
        
        if(arr.length%2==0)
        {
            return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
        }
        else
        {
            return arr[arr.length/2];
        }
    }
}
