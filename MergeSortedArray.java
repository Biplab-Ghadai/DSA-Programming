import java.util.Arrays;
class demo{
    public static void main(String args[])
    {
        int nums1[] = {-1,0,0,3,3,3,0,0,0};
        int m = 6, n = 3;
        int nums2[] = {1,2,2};
        
        for(int i=0; i<nums1.length; i++)
        {
            for(int j=i+1; j<nums1.length; j++)
            {
                if(nums1[i] != 0 && nums1[j]==0)
                {
                    int temp = nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
            //System.out.print(nums1[i]+" ");
        }
        
        for(int i=0; i<nums1.length; i++)
        {
            if(nums1[i]==0)
            {
                if(i > nums2.length-1)
                {
                    break;
                }
                else{
                    nums1[i] = nums2[i];
                }
            }
        }
        Arrays.sort(nums1);
        for(int i=0; i<nums1.length; i++)
        {
            System.out.print(nums1[i]);
        }
    }
}