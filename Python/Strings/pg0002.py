#Palindrome check – Verify if a string reads the same forward and backward.


s1 = input()
s2 = input()
rev = ""
for i in s1:
    rev = i+ rev
if s2 == rev:
    print("Palindrome")
else:
    print("Not a Palindrome")
