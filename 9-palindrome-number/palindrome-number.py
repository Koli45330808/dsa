class Solution:
    def isPalindrome(self, x: int) -> bool:
        s = str(x)
        ask = list(s)
        sss=ask.copy()
        sss.reverse()
        if(ask==sss):
            return True
        else:
            return False

        