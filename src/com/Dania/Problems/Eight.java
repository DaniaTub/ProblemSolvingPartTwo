package com.Dania.Problems;
//Given an array of integers arr,
//a lucky integer is an integer that has a frequency in the array equal to its value.
//Return the largest lucky integer in the array. If there is no lucky integer return -1.
public class Eight
{
    public int findLucky(int[] arr)
    {
//        int count=0;
//        int v;
//        for (int i = 0; i <arr.length ; )
//        {
//            v=arr[i];
//            if(v==arr[i])
//            {
//                count++;
//                i++;
//            }
//            if(count==v)
//            {
//                return  v;
//            }
//        }
//        return  count;
//    }
        int res = -1;
        int nums[] = new int[501];
        for(int i : arr){
            nums[i]++;
        }
        for(int i = 1;i<=500;i++){
            if(nums[i] == i){
                res = i;
            }
        }
        return res;
    }
}
