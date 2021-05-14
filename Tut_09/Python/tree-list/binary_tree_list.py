from drawtree import draw_level_order, draw_random_bst
class Tree:
    def __init__(self, maxSize : int):
        self.listNode = [None] * maxSize
        self.maxSize = maxSize
        self.lastUsedIndex = 0

    def insertNode(self, value):
        if self.lastUsedIndex + 1 == self.maxSize:
            return 'Full'
        self.listNode[self.lastUsedIndex + 1 ] = value
        self.lastUsedIndex += 1

    def getLeftChild(self,node :int):
        return 2 * node

    def getRightChild(self,node : int):
        return 2 * node + 1

    def getParent(self,node :int):
        return node // 2

    def addRoot(self,data: int):
        if self.listNode[1] is None:
            self.listNode[1] = data

    def addLeftChild(self,parentNode: int, data: str):
        self.listNode[self.getLeftChild(parentNode)] = data

    def addRightChild(self,parentNode: int, data: str):
        self.listNode[self.getRightChild(parentNode)] = data

    def preOrderTraversal(self, node : int):
        if self.listNode[node] is not None:
            print(self.listNode[node], end=' ')
            self.preOrderTraversal(self.getLeftChild(node))
            self.preOrderTraversal(self.getRightChild(node))

    def inOrderTraversal(self, node : int):
        if self.listNode[node] is not None:
            self.inOrderTraversal(self.getLeftChild(node))
            print(self.listNode[node], end=' ')
            self.inOrderTraversal(self.getRightChild(node))

    def postOrderTraversal(self, node:int):
        if self.listNode[node] is not None:
            self.postOrderTraversal(self.getLeftChild(node))
            self.postOrderTraversal(self.getRightChild(node))
            print(self.listNode[node], end=' ')

    def isLeaf(self,node) -> bool:
        if self.listNode[self.getLeftChild(node)] is None and self.listNode[self.getRightChild(node)] is None:
            return True
        return False

    # Assume that our tree has exist,
    def countLeaf(self) -> int:
        counter = 1
        i = 2
        while self.listNode[self.getParent(i)] is not None and self.listNode[i] is not None:
            if self.isLeaf(i):
                counter += 1
            i += 1
        return counter


if __name__ == '__main__':
    tree = Tree(100)
    tree.addRoot('A')
    tree.addLeftChild(1, 'B')
    tree.addRightChild(1, 'C')
    tree.addLeftChild(2, 'D')
    tree.addRightChild(2, 'E')
    tree.addRightChild(3, 'F')
    tree.addRightChild(7, 'H')
    tree.addLeftChild(14, 'K')
    tree.preOrderTraversal(1)
    print('\n------------------------------------------')
    tree.inOrderTraversal(1)
    print('\n------------------------------------------')
    tree.postOrderTraversal(1)
    print('\n------------------------------------------')
    print(tree.isLeaf(4))
    print(tree.countLeaf())



    # using the Draw Tree library to represent tree
   #  draw_random_bst(10)
