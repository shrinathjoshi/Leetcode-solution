# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        
        A = headA
        B = headB
        
        while A != B :
            A = headB if A is None else A.next
            B = headA if B is None else B.next
        
        return A
        