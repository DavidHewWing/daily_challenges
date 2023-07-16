# Easy just use a set to check

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        thisset = set()
        for num in nums:
            if num in thisset:
                return True
            else:
                thisset.add(num)
        return False