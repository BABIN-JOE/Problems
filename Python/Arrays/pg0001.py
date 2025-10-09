#Largest & smallest elements – Identify the maximum and minimum values in an array.

n = int(input())
arr = list(map(int,input().split()))
max = max(arr)
min = min(arr)

"""
max = arr[0]
min = arr[0]
for i in range(1, n):
    if arr[i] > max:
        max = arr[i]
    if arr[i] < min:
        min = arr[i]
"""

"""
max = sort(arr)[-1]
min = sort(arr)[0]
"""

print("Maximum element: ", max)
print("Minimum element: ", min)
