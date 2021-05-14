import time
import threading

def sleep(i):
    time.sleep(i/100)
    print(i)

def sleepSort(arr):
    lenArr = len(arr)
    for i in range(lenArr):
        newThread = threading.Thread(target=sleep, args=(arr[i],))
        newThread.start()

    return None

arr = [1,3,4,1,10,3,5,1,6,1]
sleepSort(arr)
