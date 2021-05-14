class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        # Node head
        self.head = None


    def printList(self):
        if self.head is None:
            return 'There is nothing left'
        temp = self.head
        while temp is not None:
            print(temp.data)
            temp = temp.next


    def isEmpty(self):
        return self.head == None


    def push(self, new_data):
        # create a new node
        new_Node = Node(new_data)

        new_Node.next = self.head
        self.head = new_Node

    def pop(self):
        self.head = self.head.next


    def peek(self):
        temp = self.head
        while temp.next is not None:
            temp = temp.next
        print(temp.data)

    def delete(self):
        self.head = None





if __name__ == '__main__':
    stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.pop()
    print('Last time')
    stack.printList()

