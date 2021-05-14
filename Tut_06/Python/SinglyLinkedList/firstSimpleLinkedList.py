# Node class
class Node:
    def __init__(self,data):
        self.data = data #Assign data
        self.next = None #Initialize next as null
        

# Linked List class contain a Node object

#Function to initialize head
class LinkedList:
    def __init__(self):
        self.head = None

#Code execution start here

if __name__ == '__main__':

    #Start with the empty list
    sLinkedList = LinkedList()

    sLinkedList.head = Node(1)
    second = Node(2)
    third = Node(3)

    """"
    Three nodes have been created.
    We have references to these three blocks as head,
    second and third

    llist.head        second              third
         |                |                  |
         |                |                  |
    +----+------+     +----+------+     +----+------+
    | 1  | None |     | 2  | None |     |  3 | None |
    +----+------+     +----+------+     +----+------+
    '''

    sLinkedList.head.next= second # Link first node with second 

     """"""
    Now next of first Node refers to second.  So they
    both are linked.

    llist.head        second              third
         |                |                  |
         |                |                  |
    +----+------+     +----+------+     +----+------+
    | 1  |  o-------->| 2  | null |     |  3 | null |
    +----+------+     +----+------+     +----+------+
    """"""""
    second.next = third

    
    """"""""
    Now next of second Node refers to third.  So all three 
    nodes are linked. 
  
    llist.head        second              third 
         |                |                  | 
         |                |                  | 
    +----+------+     +----+------+     +----+------+ 
    | 1  |  o-------->| 2  |  o-------->|  3 | null | 
    +----+------+     +----+------+     +----+------+  
    """"
        










