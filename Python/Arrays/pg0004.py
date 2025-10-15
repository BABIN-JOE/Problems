#Find missing number – In a sequence from 1 to n, detect which number is absent.

n = int(input())
arr = list(map(int,input().split()))
total = n * (n + 1) // 2
print(total - sum(arr))

