#Find duplicate number – Detect if any element appears more than once in the array.

n = int(input())
arr = list(map(int,input().split()))
seen = set()
duplicate = set()
for num in arr:
    if num in seen:
        duplicate.add(num)
    else:
        seen.add(num)
if duplicate:
    print("Duplicate elements:", list(duplicate))
else:
    print("No duplicates found")
