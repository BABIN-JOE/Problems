#Rotate array by k – Shift all elements right or left by k positions.

n = int(input())
arr = list(map(int,input().split()))
k = int(input())
k = k % n
arr = arr[-k:] + arr[:-k]
print(arr)

"""
# Alternatively, using reversal algorithm
def reverse(sub_arr, start, end):
    while start < end:
        sub_arr[start], sub_arr[end] = sub_arr[end], sub_arr[start]
        start += 1
        end -= 1
reverse(arr, 0, n-1)
reverse(arr, 0, k-1)
reverse(arr, k, n-1)
print(arr)
"""

"""
# Using extra space
temp = arr[-k:]
for i in range(n-k-1, -1, -1):
    arr[i+k] = arr[i]
for i in range(k):
    arr[i] = temp[i]
print(arr)
"""
