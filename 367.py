<<<<<<< HEAD
class Solution:
    def isPerfectSquare(self,num):
        if num < 0: return False
        if num <= 1: return True
        n = num/2  # start guessing using n = num/2
        while n*n!= num:
            inc = (num-n*n)/(2*n)
            n += inc
            if -1 <= inc <= 1: break
        if n*n < num: n+=1
        if n*n > num: n-=1
=======
class Solution:
    def isPerfectSquare(self,num):
        if num < 0: return False
        if num <= 1: return True
        n = num/2  # start guessing using n = num/2
        while n*n!= num:
            inc = (num-n*n)/(2*n)
            n += inc
            if -1 <= inc <= 1: break
        if n*n < num: n+=1
        if n*n > num: n-=1
>>>>>>> bd73dae2252ce94b29b2ea592175ad69de1635fe
        return n*n == num