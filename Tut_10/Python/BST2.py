class Node:
    def __init__(self, data):
        self.data = data

class BST:
    def __init__(self):
        self.root = Node(None)
        self.leftSubTree = None
        self.rightSubTree = None

    def addRoot(self, value):
        self.root = Node(value)

    def insert(self,t, value):
        if t.root.data == None:
            t.addRoot(value)

        if value == t.root.data:
            return 'Cannot insert that value'

        if value < t.root.data:
            if t.leftSubTree is None:
                t1 = BST()
                t1.addRoot(value)
                t.leftSubTree = t1
            else:
                self.insert(t.leftSubTree, value)
        if value > t.root.data:
            if t.rightSubTree is None:
                t1 = BST()
                t1.addRoot(value)
                t.rightSubTree = t1
            else:
                self.insert(t.rightSubTree, value)

    def preOrderTraversal(self, t):
        if t is not None:
            print(t.root.data)
            self.preOrderTraversal(t.leftSubTree)
            self.preOrderTraversal(t.rightSubTree)



if __name__ == '__main__':
    bst = BST()
    bst.insert(bst, 8)
    bst.insert(bst, 3)
    bst.insert(bst, 1)
    bst.insert(bst, 6)
    bst.insert(bst, 4)
    bst.insert(bst, 7)
    bst.insert(bst, 10)
    bst.insert(bst, 14)
    bst.insert(bst, 13)
    bst.preOrderTraversal(bst)

