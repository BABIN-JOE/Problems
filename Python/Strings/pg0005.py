#Remove duplicates – Eliminate repeated characters, keeping only the first occurrence of each.

s = input()
result = ''
for i in s:
    if i not in result:
        result += i
print(result)
