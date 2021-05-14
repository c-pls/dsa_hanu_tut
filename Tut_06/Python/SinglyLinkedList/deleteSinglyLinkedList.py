class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
class SLinkedList:
    def __init__(self):
        # Node head
        self.head = None
    def traverse(self):
        if self.head == 0:
            print("There is no linked list")
        else:
            node = self.head
            while node is not None:
                print(node.data)
                node = node.next
    def search(self,value):
        if self.head == 0:
            print('no linked list for searching')
        else:
            node = self.head
            while node is not None:
                if node.data == value:
                    return True
                node = node.next
            return False
    def deleteNode(self,value):
        #Store the head node
        temp = self.head
        if temp is not None:
            if temp.data == value:
                self.head = temp.next
                temp = None
                return

        #Search for the key to be deleted, keep track of previous
        while( temp is not None ):
            if temp.data == value:
                break
            prev = temp
            temp = temp.next

            # If value is not present on the linked list
            if ( temp == None ):
                return

            #Unlink the node from the linked list
            prev.next = temp.next
            temp = None

if __name__ == '__main__':
    first = Node(1)
    second = Node(2)
    third = Node(3)
    sll = SLinkedList()
    sll.head = first
    first.next = second
    second.next = third

    sll.deleteNode(2)
    sll.traverse()
    print(sll.search(10) )



