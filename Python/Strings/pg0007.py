#Longest substring without repeating – Find the maximum-length substring that has all unique characters.

s = input()
char_set = set()
left = 0
max_len = 0
start = 0
for right in range(len(s)):
    while s[right] in char_set:
        char_set.remove(s[left])
        left += 1
    char_set.add(s[right])
    
    if right - left + 1 > max_len:
        max_len = right - left + 1
        start = left
print(s[start:start + max_len])
