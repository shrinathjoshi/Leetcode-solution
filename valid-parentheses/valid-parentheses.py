class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for ch in s:
            if (ch == '('):
                stack.append(')')
            elif (ch == '{'):
                stack.append('}')
            elif (ch == '['):
                stack.append(']')
            elif (len(stack)==0 or ch != stack.pop()):
                return False
            
        return len(stack)==0
        