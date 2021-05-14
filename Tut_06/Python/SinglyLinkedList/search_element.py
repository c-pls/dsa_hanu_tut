class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
class SLL:
    def __init__(self):
        self.head = None
    def traverse(self):
        node = self.head
        while node:
            print(node.data)
            node = node.next
    def push(self,data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    # Recursion method to find the element

    def find_ele(self,node,value):
        if not node:
            return False
        if node.data == value:
            return True
        return self.find_ele(node.next,value)



if __name__ == '__main__':
    sll = SLL()
    sll.push(5)
    sll.push(4)
    sll.push(3)
    sll.push(2)
    sll.push(1)
    sll.traverse()
    print(sll.find_ele(sll.head,6))
