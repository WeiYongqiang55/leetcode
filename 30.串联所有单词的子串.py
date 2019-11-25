'''
@Author: your name
@Date: 2019-11-24 21:32:39
@LastEditTime: 2019-11-25 10:12:12
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\30.串联所有单词的子串.py
'''
#
# @lc app=leetcode.cn id=30 lang=python3
#
# [30] 串联所有单词的子串
#

# @lc code=start
class Solution:
    def findSubstring(self, s, words):
        from collections import defaultdict
        # from collections import Counter
        if not s or not words : return []
        # print(len(''.join(words)))
        # counter = Counter(words)   #下一步优化 思路 
        # print(wordss)
        if len(s) < len(''.join(words)): return [] #针对超长字符串  有点慢
        word_len = len(words[0])
      
        # words_copy= words.copy()
        first_char = []
        counter={}
        for word in words:
            if word in counter.keys():
                counter[word]+=1
            else:
                counter[word] =1
            first_char.append(word[0])
        counter_copy = counter.copy()
        start = 0
        end = 0
        res=[]
        while start < len(s)-word_len+1:
            if s[start] in first_char:#有可能是words中的单词
                left = right = start
                if s[left:left+word_len] in words:
                    # words_copy.remove(s[left:left+word_len])
                    counter_copy[s[left:left+word_len]]-=1
                    right += word_len
                    while right < len(s)-word_len+1:
                        # if s[right:right+word_len] not in words:
                        if s[right:right+word_len] not in words or counter_copy[s[right:right+word_len]] < 1:
                            break
                        else:
                            # words_copy.remove(s[right:right+word_len])
                            counter_copy[s[right:right+word_len]]-=1
                            right += word_len
                    # if not len(words_copy):#长度0
                    # flag=True
                    sum=0
                    for key in counter_copy.keys():
                        # if counter_copy[key]!=0:
                        #     flag=False             
                        sum += counter_copy[key]
                    # if flag:
                    #     res.append(left)
                    if not sum:
                        res.append(left) 
                    start = left+1 #因为根据cases s中的单词可以重复使用
                    # words_copy = words.copy()
                    counter_copy = counter.copy()
                else:
                    start +=1
                    continue
            else:
                start += 1 
        return res

a = Solution()
print(a.findSubstring("barfoofoobarthefoobarman",
["bar","foo","the"]))
# @lc code=end

