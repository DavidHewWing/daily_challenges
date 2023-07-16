class Solution:
    # 1. Add all values to a occurrance dict
    # 2. Go through lenght of array and check if it is in dict
    # 3. Formulate the result list.
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        my_dict = {}
        result = []
        for i in range(1, len(nums) + 1):
            my_dict[i] = 0
        
        for num in nums:
            my_dict[num] += 1
        
        for num in my_dict:
            if my_dict[num] == 0:
                result.append(num)

        return result

# Better solution would be to mark visted then go through the visted ones
# makes for better space complexity