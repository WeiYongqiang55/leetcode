class Solution:
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        # dic={}
        # for num in nums1:
        #     if num in dic:
        #         dic[num]+=1
        #     else:
        #         dic[num]=1
        # result=[]
        # for num in nums2:
        #     if num in dic and dic[num]:
        #         result.append(num)
        #         dic[num]-=1
        # return result  
        import collections
        a, b = map(collections.Counter, (nums1, nums2))
        print(a&b)
        return list((a & b).elements())  

        
if __name__ == "__main__":
    so = Solution()
    nums1=[1,2,2,1,3,4,5,6,7]
    nums2=[2,2]
    print(so.intersect(nums1,nums2))