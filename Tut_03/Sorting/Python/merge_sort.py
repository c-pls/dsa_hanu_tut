def ms(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        left = arr[mid:]
        right = arr[:mid]

        ms(left)
        ms(right)
        l = 0
        r = 0
        i = 0
        while l < len(left) and r < len(right):
            if left[l] < right[r]:
                arr[i] = left[l]
                l += 1
            else:
                arr[i] = right[r]
                r += 1
            i += 1
        while l < len(left):
            arr[i] = left[l]
            i += 1
            l += 1
        while r < len(right):
            arr[i] = right[r]
            i += 1
            r += 1


if __name__ == '__main__':
    arr = [3, 2, 5, 2, 5, 1, 5, 2, 43, 2, 3, 5, 21, 4]
    ms(arr)
    print(arr)

