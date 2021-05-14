class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Queue:
    def __init__(self):
        # Node head
        self.front = None
        self.rear = None

    def isEmpty(self):
        return self.front == None

    def enQueue(self, data):
        temp = Node(data)
        if self.rear == None:
            self.front = self.rear = temp
            return
        self.rear.next = temp
        self.rear = temp

    def deQueue(self):
        if self.isEmpty():
            return 

        temp = self.front
        self.front = temp.next

        if self.front == None:
            self.rear = None

if __name__== '__main__': 
    q = Queue() 
    q.enQueue(10) 
    q.enQueue(20) 
    #q.DeQueue() 
    #q.DeQueue() 
    q.enQueue(30) 
    q.enQueue(40) 
    q.enQueue(50)  
    q.deQueue()    
    print("Queue Front " + str(q.front.data)) 
    print("Queue Rear " + str(q.rear.data)) 





