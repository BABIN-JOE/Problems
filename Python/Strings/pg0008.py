#Word frequency – Count how many times each word appears in a sentence.

s = input()
words = s.split()
word_freq = {}
for word in words:
    word_freq[word] = word_freq.get(word, 0) + 1
print(word_freq)
