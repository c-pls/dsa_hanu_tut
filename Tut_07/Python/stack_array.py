from sys import maxsize

class Stack:
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)
        print(f'{item} pushed to stack')

    def pop(self):
        a = self.stack.pop()
        print( f'{a} has been pop out')
        return a

    def peek(self):
        return self.stack[len(self.stack) - 1]

if __name__ == '__main__':
    stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)

    stack.peek()
    stack.pop()
    stack.pop()
    stack.peek()
    print(stack.isEmpty() )
    





