class Queue:
    def __init__(self):
        self.queue = []

    def enqueue(self, data):
        self.queue.append(data)


    def dequeue(self):
        self.queue = self.queue[1:]

    def printQueue(self):
        for item in self.queue:
            print(item, end=' ')



if __name__ == '__main__':
    queue = Queue()
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.printQueue()
    print('new line')
    queue.dequeue()
    queue.printQueue()


