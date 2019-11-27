'''
@Author: your name
@Date: 2019-11-27 23:23:12
@LastEditTime: 2019-11-27 23:23:54
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\191.位-1-的个数.py
'''
class Solution:
    # @param n, an integer
    # @return an integer
#    190
    def reverseBits(self, n):
#        str=bin(n)[2:].zfill(32)
#        print(str)
#        str=str[::-1]
#        print(str)
#        result = int(str,2)
#        print(result)
        oribin='{0:032b}'.format(n)
        print(oribin)
        reversebin=oribin[::-1]
        return int(reversebin,2)
#        191
    def hammingWeight(self, n):
        str='{0:032b}'.format(n)
        num=str.count('1')
        return num