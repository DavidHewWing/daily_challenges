class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        my_dict = {}
        for num in nums:
            if num not in my_dict:
                my_dict[num] = 0
            my_dict[num] += 1

        for key in my_dict:
            if my_dict[key] == 1:
                return key

        return 0