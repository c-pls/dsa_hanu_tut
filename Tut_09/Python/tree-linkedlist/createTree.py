class TreeNode:
    def __init__(self, data, children=[]):
        self.data = data
        self.children = children

    def __str__(self, level=0):
        ret = '   ' * level + str(self.data) + '\n'
        for child in self.children:
            ret += child.__str__(level + 1)
        return ret

    def addNode(self, TreeNode):
        self.children.append(TreeNode)


if __name__ == '__main__':
    tree = TreeNode('Student', [])
    ID = TreeNode('ID', [])
    # name field
    Name = TreeNode('Name', [])
    first = TreeNode('First', [])
    middle = TreeNode('Middle', [])
    last = TreeNode('Last', [])
    Name.addNode(first)
    Name.addNode(middle)
    Name.addNode(last)
    # Address field
    Address = TreeNode('Address', [])
    street = TreeNode('Street', [])
    area = TreeNode('Street', [])
    Address.addNode(street)
    Address.addNode(area)
    tree.addNode(ID)
    tree.addNode(Name)
    tree.addNode(Address)
    print(tree)
