class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
class SLL:
    def __init__(self):
        # Node head
        self.head = None
    def traverse(self):
        if self.head is None:
            print('there is no linked list')
        else:
            node = self.head
            while node is not None:
                print(node.data)
                node = node.next
    def insert_beginning(self,value):
        #Insert at the beginning
        if self.head is None:
            print('There is no linked list')
        else:
            new_node = Node(value)
            new_node.next = self.head
            self.head = new_node
    def delete_at_pos(self,pos):
        if self.head is None:
            print('There is no linked list')
        else:
            # Using two variables
            pre_node = self.head
            node = pre_node.next
            if pos == 1:
                self.head = node
                pre_node = None
            else:
                for i in range(pos - 2):
                    pre_node = pre_node.next
                    node = pre_node.next

            # The value need to deleted is node now
                pre_node.next = node.next
                node.next = None
    def delete_at_pos2(self,pos):
        if self.head is None:
            return

        #Store
        node = self.head

        if pos == 0:
            self.head = node.next
            node = None
            return

        for i in range(pos - 1):
            node = node.next
            if node is None:
                break

        if node is None:
            return
        if node.next is None:
            return

        # Node.next is item to be deleted

        # Store the node behind the node that need to be deleted
        next = node.next.next

        # Unlink

        node.next = None

        node.next = next

        # Delete at the beginning


if __name__ == '__main__':
    first = Node(3)
    second = Node(4)
    third = Node(5)

    sll = SLL()
    sll.head = first
    first.next = second
    second.next = third
    sll.insert_beginning(2)
    sll.insert_beginning(1)
    #sll.delete_at_pos(1)
    sll.delete_at_pos2(3)
    sll.traverse()



