class Solution:
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        # set1=set(nums1)
        # set2=set(nums2)
        # result =[]
        # for num in set1:
        #     if num in set2:
        #         result.append(num)
        
        # return result


        # if len(nums1)<len(nums2):nums1,nums2=nums2,nums1
        # s = set(nums1)
        # return list({x for x in nums2 if x in s})
    

        #新学到的知识点啊
        nums1 = set(nums1)
        nums2 = set(nums2)
        return list(nums1 & nums2)

if __name__ == "__main__":
    so = Solution()
    nums1=[1,2,2,1,3,4,5]
    nums2=[2,2]
    print(so.intersection(nums1,nums2))