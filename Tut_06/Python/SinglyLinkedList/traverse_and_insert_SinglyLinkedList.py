class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
class SLinkedList:
    def __init__(self):

        # Node head
        self.head = None
    def traverse(self):
        if self.head is None:
            print('There is no linked list')
        else:
            node = self.head
            while node is not None:
                print(node.data)
                node = node.next
    def insert_beginning(self,value):
             new_node = Node(value)
             #Make next of new Node as head
             new_node.next = self.head

             #Move the head to point to new Node
             self.head = new_node
    def insert_after(self,value,pre_node):
        if pre_node is None:
            print("The given previous node must in the linked list")

        new_node = Node(value)
        new_node.next = pre_node.next
        pre_node.next = new_node
    def insert_end(self,value):

        new_node = Node(value)
        new_node.next = None

        #traverse till the last node
        last = self.head
        while(last.next):
            last = last.next
        last.next = new_node



if __name__ == '__main__':
    sLinkedList = SLinkedList()

    first = Node(5)
    second = Node(9)
    third = Node(10)

    sLinkedList.head = first
    sLinkedList.head.next = second
    second.next = third;

    sLinkedList.insert_beginning(12)
    sLinkedList.insert_after(20,third)
    sLinkedList.insert_after(30,sLinkedList.head.next)
    sLinkedList.insert_end(40)
    sLinkedList.insert_beginning(6969)


    sLinkedList.traverse()



