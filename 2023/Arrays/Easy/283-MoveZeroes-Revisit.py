# Count Zeroes, Move Non zeroes to front keeping track of last index you placed, add the zeroes to the end

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        numZeroes = 0
        for num in nums:
            if num == 0:
                numZeroes += 1

        pointer = 0
        for i in range(0, len(nums)):
            if nums[i] != 0:
                nums[pointer] = nums[i]
                pointer += 1
        
        for i in range(pointer, len(nums)):
            nums[i] = 0
