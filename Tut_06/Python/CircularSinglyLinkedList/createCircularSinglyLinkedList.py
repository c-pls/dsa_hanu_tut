class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
class CSLinkedList:
    # Constructor to create a empty circular linkled list
    def __init__(self):
        # Node head
        self.head = None
    #Function to insert a node at the beginning
    def push(self,data):
        new_node = Node(data)

        temp = self.head

        new_node.next = self.head

        # If linked list is not None, set the next of last node

        if self.head is not None:
            while (temp.next != self.head):
                temp = temp.next
            temp.next = new_node
        else:
            new_node.next = new_node
        self.head = new_node
     # Function to trarvese a circular linked list
    def traverse(self):
         temp = self.head
         if self.head is not None:
             while(True):
                 print(temp.data)
                 temp = temp.next
                 if temp == self.head:
                     break

if __name__ == '__main__':

    #Initialize list as empty
    cll = CSLinkedList()

    cll.push(5)
    cll.push(4)
    cll.push(3)
    cll.push(2)
    cll.push(1)

    cll.traverse()






