class Node:
    def __init__(self,data):
        self.data = data
        self.next = next
        class SLL:
            def __init__(self):
                # Node
                self.head = None
                def push(self,value):

        #Insert at the beginning of the linked list
        new_node = Node(value)

        new_node.next = self.head
        self.head = new_node
        def get_Nth_ele(self,pos):
            count = 0
            node = self.head
            while node is not None:
                if count == pos:
                    return node.data
            node = node.next
            count += 1
            return -1

if __name__ == '__main__':
    sll = SLL()
    sll.push(7)
    sll.push(6)

    sll.push(5)
    sll.push(4)

    sll.push(3)

    sll.push(2)



    sll.push(1)
    print(sll.get_Nth_ele(3))


