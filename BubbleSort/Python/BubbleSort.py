def bubbleSort(array):
    n = len(array)
    for i in range(n - 1):
        for j in range(0, n - i - 1):
            if array[j] > array[j + 1]:
                array[j], array[j + 1] = array[j + 1], array[j]


array = [3, 8, 0, 1, 4, 90, 10]

bubbleSort(array)

print("Sorted array is:")
for i in range(len(array)):
    print(array[i])
