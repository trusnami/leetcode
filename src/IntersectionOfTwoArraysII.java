
// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
class IntersectionOfTwoArraysII {

    public static void main(String[] args) {

        IntersectionOfTwoArraysII solution = new IntersectionOfTwoArraysII();
        int[] nums1 = {1, 2, 2, 1, 4};
        int[] nums2 = {2, 2, 3};
        int[] result = solution.intersect(nums1, nums2);
        // solution.intersect(nums1, nums2);
        for(int i=0;i<result.length;i++)
            System.out.println(result[i]);
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] log2 = new int[n2];
        int i,j;

        for(i=0;i<n2;i++){
            log2[i] = 1;
        }

        for(i=0;i<n1;i++){
            for(j=0;j<n2;j++){
                if(log2[j] == 1 && nums1[i] == nums2[j]){
                    log2[j] = 0;
                    break;
                }
            }
        }

        j=0;
        for(i=0;i<n2;i++){
            if(log2[i]==0){
                j++;
            }
        }
        int[] result = new int[j];
        j=0;
        for(i=0;i<n2;i++){
            if(log2[i]==0){
                result[j]=nums2[i];
                j++;
            }
        }
        return result;
    }

}