#Check anagrams – Determine if two strings have the same letters in any order.

s1 = input()
s2 = input()
if sorted(s1) == sorted(s2):
    print("Anagrams")
else:
    print("Not Anagrams")
