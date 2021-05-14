def bubbleSort(arr):
    lenArr = len(arr)
    for i in range(lenArr):
        checked = False
        for j in range(0, lenArr - i - 1):
            if (arr[j] > arr[j + 1]):
                arr[j], arr[j+1] = arr[j+1], arr[j]
                checked = True
        if  not checked:
            break

arr = [3,21,5,1,6,4,7,3,1,4]
bubbleSort(arr)
print(arr)


