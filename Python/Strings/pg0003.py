#Count vowels & consonants – Count how many vowels (a, e, i, o, u) and consonants exist in a string.

s = input()
vowels = ['a','e','i','o','u']
c1 = 0
c2 = 0
for i in s:
    if i.isalpha():
        if(i.lower() in vowels):
            c1+=1
        else:
            c2+=1
print("Vowels: ",c1)
print("Consonants: ",c2)
