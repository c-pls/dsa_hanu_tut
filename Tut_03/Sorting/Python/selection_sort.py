def selection_sort(arr):
    for i in range(0, len(arr) - 1):
        min_index = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j
        # Swap two num
        arr[min_index], arr[i] = arr[i], arr[min_index]
    return arr

if __name__ == '__main__':
    arr = [4, 2, 4, 1, 5, 1, 5, 10, 3, 5, 6, 6, 53, 1, 5, 8, 4]
    print(selection_sort(arr))

