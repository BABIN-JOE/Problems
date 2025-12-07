#Find missing number – In a sequence from 1 to n, detect which number is absent.

n = int(input())
arr = list(map(int,input().split()))
print(n * (n + 1) // 2)

