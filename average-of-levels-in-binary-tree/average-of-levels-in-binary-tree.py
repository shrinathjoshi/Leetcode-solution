# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def averageOfLevels(self, root):
        result = []
        queue = []
        
        if root == None:
            return result
        
        queue.append(root)
        
        while(len(queue)>0):
            size = len(queue)
            temp = size
            cSum = 0.0
            while(temp>0):
                top = queue.pop(0)
                cSum +=top.val
                if top.left != None:
                    queue.append(top.left)
                    
                if top.right != None:
                    queue.append(top.right)
                
                temp=temp-1
                
            result.append(cSum/size)
           
        return result
        
        