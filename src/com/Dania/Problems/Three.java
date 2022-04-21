package com.Dania.Problems;
//Given the array nums,
// for each nums[i] find out how many numbers in the array are smaller than it.
// That is, for each nums[i] you have to count the
// number of valid j's such that j != i and nums[j] < nums[i].
public class Three
{

    public int[] smallerNumbersThanCurrent(int[] nums)
    {
        int v;
        int[] arr=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;)
        {
            v=nums[i];
            for (int j = 0; j <nums.length; j++)
            {
                int m=nums[j];
                if(v>m)
                {
                    count++;
                }
                for (int k = 0; k <arr.length ; k++)
                {
                    arr[i]=count;
                }
            }
            i++;
            count=0;
        }
        return arr;
    }


}
