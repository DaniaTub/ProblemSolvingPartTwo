package com.Dania.Problems;
//you are given an integer array nums.
// The unique elements of an array are the elements that appear exactly
// once in the array.
public class Two {
    public int sumOfUnique(int[] nums) {


            int count[] = new int[100];
            for (int i = 0; i < nums.length; i++) {
                count[nums[i]]++;
            }
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                if (count[i] == 1) {
                    sum += i;
                }
            }

            return sum;


        }
    }


