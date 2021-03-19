class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        n = len(rooms)
        
        if n == 1:
            return True
        
        queue = []
        visitedRoom = []
        visitedRoom.append(0)
        
        for _ in rooms[0]:
            queue.append(_)

        
        while(len(queue)>0):
            top = queue.pop()
            if top not in visitedRoom:
                visitedRoom.append(top)

                nextRooms = rooms[top]
                for _ in nextRooms: 
                    queue.append(_)

        
        for i in range(0,n):
            if i not in visitedRoom:
                return False
        
        return True
        