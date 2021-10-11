package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {

        int[] arrayOfTwoNums = new int[0];
        int sumOfTwoNums;
        int indOfSmallerNum = 0, indOfBiggerNum = nums.length - 1;

        while (indOfSmallerNum < indOfBiggerNum && arrayOfTwoNums.length == 0) {
            sumOfTwoNums = nums[indOfSmallerNum] + nums[indOfBiggerNum];

            if (sumOfTwoNums < target) {
                indOfSmallerNum++;
            } else if (sumOfTwoNums > target) {
                indOfBiggerNum--;
            } else {
                arrayOfTwoNums = new int[]{nums[indOfSmallerNum], nums[indOfBiggerNum]};
            }
        }
        return arrayOfTwoNums;
    }
}
