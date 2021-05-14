# for Garbage collection
import gc
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None
        class DLL:
            def __init__(self):
                self.head = None

    def deleteNode(self, dele):

        if self.head is None or dele is None:
            return

        # If node to be deleted is head node
        if self.head == dele:
            self.head = dele.next

        # Change next if only the node to be deleted is not the last node

        if dele.next is not None:
            dele.next.prev = dele.prev

        # Change prev only if node to be deleted is not the first node
        if dele.prev is not None:
            dele.prev.next = dele.next

        # Free memory
        gc.collect

    def push(self, new_data):
        new_node = Node(new_data)
        new_node.next = self.head

        if self.head is not None:
            self.head.prev = new_node

        self.head = new_node

    def traverse(self,node):
        while node is not None:
            print(node.data)
            node = node.next

dll = DLL()

# Let us create the doubly linked list 10<->8<->4<->2
dll.push(2);
dll.push(4);
dll.push(8);
dll.push(10);

print( "\n Original Linked List")
dll.traverse(dll.head)

# delete nodes from doubly linked list
dll.deleteNode(dll.head)
dll.deleteNode(dll.head.next)
dll.deleteNode(dll.head.next)
# Modified linked list will be NULL<-8->NULL
print ("\n Modified Linked List")
dll.traverse(dll.head)
