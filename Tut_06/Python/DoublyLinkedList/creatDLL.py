class Node:
    def __init__(self, next = None, prev = None, data = None):
        self.data = data 
        self.next = next # Reference to the next node in DLL
        self.prev = prev # Reference to the previous node in DLL
class CLL:
    def __init__(self):
        # Node Head
        self.head = None

    # Adding a node at the front of the list
    def push(self, new_data):

        # Allocate the node and put it in the data
        new_node = Node(data = new_data)

        # Make the next of the new node as head and prev as None
        new_node.next = self.head
        new_node.prev = None

        # move the head to point to the new node
        self.head = new_node

    # Adding the node after given node
    def insert_After(self, pre_node, new_data):
        # Check if the prev node is None
        if pre_node is None:
            print('This node doesnt exist')
            return

        # Allocate the node and put the data on it
        new_node = Node(new_data)

        # Make the next of new node is the next of previous
        new_node.next = pre_node.next

        # Make the previous of new node is the prev node
        new_node.prev = pre_node

        # Make the next of prev_node is new_node
        pre_node.next = new_node
        
        # Change previous of new_node's next node
        if new_node.next is not None:
            new_node.next.prev = new_node

    # Adding the node before the given node
    def insert_Before(self, after_node, new_data):
        # Check if the after node is None
        if after_node is None:
            print('This node does not exist')
            return

        # Allocate the node and put the data on it
        new_node = Node(new_data)

        # Make the next of the new node is after_node
        new_node.next = after_node

        # Make the previous of the new node is prev of after_node
        new_node.prev = after_node.prev

        # Make the previous of the after node is new_node
        after_node.prev = new_node

        # Change next of the new_node's previous node
        if new_node.prev is not None:
            new_node.prev.next = new_node

    # Adding at the end
    def append(self,new_data):
        
        # Allocate the node and put data on it
        new_node = Node(new_data)
        last = self.head

        # Next of the new node is None
        new_node.next = None

        """
        If the linked list empty
        then make the new node as head
        """
        if self.head is None:
            self.head = new_node
            return
        while last.next is not None:
            last = last.next

        # Change the next of the last node
        last.next = new_node

        new_node.prev = last
        return

    # Function to traverse through the CLL
    def traverse(self):
        temp = self.head
        while temp is not None:
            print(temp.data)
            temp = temp.next

  
# Code execution starts here 
if __name__=='__main__': 
  
    # Start with the empty list 
    llist = CLL()
  
    # Insert 6.  So linked list becomes 6->None 
    llist.append(6) 
  
    # Insert 7 at the beginning. So linked list becomes 7->6->None 
    llist.push(7); 
  
    # Insert 1 at the beginning. So linked list becomes 1->7->6->None 
    llist.push(1); 
  
    # Insert 4 at the end. So linked list becomes 1->7->6->4->None 
    llist.append(4) 
  
    # Insert 8, after 7. So linked list becomes 1 -> 7-> 8-> 6-> 4-> None 
    llist.insert_After(llist.head.next, 8) 
  
    print ('Created linked list is:') 
    llist.traverse() 


