class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
class SLL:
    def __init__(self):
        self.head = None
    def traverse(self):
        if self.head is None:
            return
        else:
            node = self.head
            while node is not None:
                print(node.data)
                node = node.next
    def countLength(self):
            count = 0
            node = self.head
            while(node):
                count += 1
                node = node.next
            return count
    def countLength_Recursive(self,node):
        #Base case
        if not node:
            return 0
        else:
            return 1 + self.countLength_Recursive(node.next)


    def push(self,new_data):
          new_node = Node(new_data)

          new_node.next = self.head
          self.head = new_node

if __name__ == '__main__':
    sll = SLL()
    sll.push(3)
    sll.push(2)
    sll.push(1)
    sll.traverse()
    print('The length of linked list is',sll.countLength())
    print('The length of linked list is',sll.countLength_Recursive(sll.head))

