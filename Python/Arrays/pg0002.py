#Reverse array – Rearrange elements so the first becomes last and vice versa, without extra space.

n = int(input())
arr = list(map(int,input().split()))

"""
print(arr[::-1])
"""

left = 0
right = n-1
while(left<right):
    arr[left],arr[right] = arr[right],arr[left]
    left+=1
    right-=1
print(arr)
