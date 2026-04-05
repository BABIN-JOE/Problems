# Reverse a string – Rearrange characters in a string from last to first without built-in reverse.

s = input()
reversed = ''
for i in s:
    reversed = i + reversed
print(reversed)
