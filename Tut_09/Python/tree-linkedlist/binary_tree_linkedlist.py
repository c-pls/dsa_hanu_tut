import queue_linkedlist as queue

# Implement binary tree using linked list


class TreeNode:
    def __init__(self, data):
        self.data = data
        self.leftChild = None
        self.rightChild = None

    def preOrder_traversal(self, rootNode):
        if not rootNode:
            return
        print(rootNode.data)
        self.preOrder_traversal(rootNode.leftChild)
        self.preOrder_traversal(rootNode.rightChild)

    def inOrder_traversal(self, rootNode):
        if not rootNode:
            return
        self.inOrder_traversal(rootNode.leftChild)
        print(rootNode.data)
        self.inOrder_traversal(rootNode.rightChild)

    def postOrder_traversal(self, rootNode):
        if not rootNode:
            return
        self.postOrder_traversal(rootNode.leftChild)
        self.postOrder_traversal(rootNode.rightChild)
        print(rootNode.data)

    def levelOrder_traversal(self, rootNode):
        if not rootNode:
            return
        temp_queue = queue.Queue()
        temp_queue.enQueue(rootNode)
        while not temp_queue.isEmpty():
            root = temp_queue.deQueue()
            print(root.data)
            if root.leftChild is not None:
                temp_queue.enQueue(root.leftChild)
            if root.rightChild is not None:
                temp_queue.enQueue(root.rightChild)

    def search(self, data, rootNode):
        if not rootNode:
            return
        temp_queue = queue.Queue()
        temp_queue.enQueue(rootNode)
        while not temp_queue.isEmpty():
            root = temp_queue.deQueue()
            if root.data == data:
                return True
            if root.leftChild is not None:
                temp_queue.enQueue(root.leftChild)
            if root.rightChild is not None:
                temp_queue.enQueue(root.rightChild)
        return False

    def insert(self, rootNode, data):
        if not rootNode:
            return
        temp_queue = queue.Queue()
        temp_queue.enQueue(rootNode)
        while not temp_queue.isEmpty():
            root = temp_queue.deQueue()
            if not root.leftChild or not root.rightChild:
                root.rightChild.data = data
            if not root.leftChild:
                temp_queue.enQueue(root.leftChild)
            if not root.rightChild:
                temp_queue.enQueue(root.rightChild)


if __name__ == '__main__':
    n1 = TreeNode('N1')
    n2 = TreeNode('N2')
    n3 = TreeNode('N3')
    n4 = TreeNode('N4')
    n5 = TreeNode('N5')
    n6 = TreeNode('N6')
    n7 = TreeNode('N7')
    n8 = TreeNode('N8')
    n9 = TreeNode('N9')
    n10 = TreeNode('N10')

    # N4 is the parent of n9 and n10
    n4.leftChild = n9
    n4.rightChild = n10

    # N2 is the parent of n4 and n5
    n2.leftChild = n4
    n2.rightChild = n5

    # N3 is the parent of n6 and n7
    n3.leftChild = n6
    n3.rightChild = n7

    # Finally N1 is the root
    n1.leftChild = n2
    n1.rightChild = n3
    print('------------Pre order------- ')
    n1.preOrder_traversal(n1)
    print('---------In order-------------')
    # In order
    n1.inOrder_traversal(n1)
    print('-------Post Order-------------')
    # Post order
    n1.postOrder_traversal(n1)

    n1.levelOrder_traversal(n1)

    # Search
    print(n1.search('N7', n1))
    n1.insert(n1, 'N67')
    n1.preOrder_traversal(n1)
