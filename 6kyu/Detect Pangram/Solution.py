def is_pangram(s):
    isPanagram = True
    alphabet = "abcdefghijklmnopqrstuvwxyz"
    
    for letter in alphabet:
        if letter not in s.lower():
            isPanagram = False
    
    return isPanagram