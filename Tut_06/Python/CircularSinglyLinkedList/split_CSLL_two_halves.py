class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
class CLL:
    # Constructor to create an empty CLL
    def __init__(self):
        self.head = None
    # Function to insert a node 
    def push(self,data):

        new_node = Node(data)

        temp = self.head

        new_node.next = self.head

        if self.head is not None:
            while ( temp.next != self.head ):
                temp = temp.next
            # The pointer(temp) now is at the last node
            temp.next = new_node
        else:
            new_node.next = new_node
        self.head = new_node
    
    # Traverse through a CLL
    def traverse(self):
        temp = self.head
        if self.head is not None:
            while True:
                print(temp.data)
                temp = temp.next
                if temp == self.head:
                    break
    """
    Function to split CLL into two list
    Head1 and head2 are the head nodes of that two nodes
    """
    def split(self,head1,head2):
        # Using tortoise and hare algorithms
        slow_ptr = self.head
        fast_ptr = self.head
        
        if self.head is None:
            return
        
        """
        If there are odd nodes in the circular linked list then
        fast_ptr.next becomes heads for even nodes
        fast_ptr.next.next becomes head 
        """
        while fast_ptr.next != self.head and fast_ptr.next.next != self.head:
            fast_ptr = fast_ptr.next.next
            slow_ptr = slow_ptr.next

        """
        If there are even nodes in the cll then move fast_ptr
        """
        if fast_ptr.next.next == self.head:
            fast_ptr = fast_ptr.next

        # Set the head pointer of first half
        head1.head = self.head

        # Set the head pointer of second half
        if self.head.next != self.head:
            head2.head = slow_ptr.next

        # Make second half circular
        fast_ptr.next = slow_ptr.next

        # Make first half circular
        slow_ptr.next = self.head



if __name__ ==  '__main__':
    cll = CLL()  
    cll.push(1)
    cll.push(2)
    cll.push(3)
    cll.push(4)
    cll.push(5)
    cll.push(6)
    cll.push(7)
    cll.traverse()

    head1 = CLL()
    head2 = CLL()
    cll.split(head1,head2)

    print('First circular linked list \n')
    head1.traverse()

    print('Second circular linked list\n')
    head2.traverse()







