class Solution:
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        ##method 2 
        dic = {}
        for i, num in enumerate(numbers):
            if target-num in dic:
                return [dic[target-num]+1, i+1]
            dic[num] = i

if __name__ == "__main__":
    so=Solution()
    result = so.twoSum([0,0,3,4],0)
    print(result)