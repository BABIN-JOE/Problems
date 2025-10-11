#Move zeros to end – Rearrange so all 0s shift to the end while keeping non-zeros in order.

n = int(input())
arr = list(map(int,input().split()))
j = 0
for i in range(n):
    if arr[i] != 0:
        arr[j] = arr[i]
        j += 1
for i in range(j, n):
    arr[i] = 0

"""
for i in arr:
    if arr[i] == 0:
        arr.remove(arr[i])
        count += 1
for i in range(count):
    arr.append(0)
"""

print(arr)

