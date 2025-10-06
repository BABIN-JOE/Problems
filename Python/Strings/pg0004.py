#First non-repeating character – Find the first character that appears only once in the string.

s = input()
for i in s:
    if s.count(i) == 1:
        print(i)
        break
else:
    print("No non-repeating character")
