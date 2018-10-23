# Angus Mackenzie

# Brute Force String Search
def BruteForceStringMatch(text,pattern):
    print("Searching for",pattern,"in")
    print(text)
    for k in range (len(text)):
        j = 0
        while j < len(pattern) and pattern[j]==text[k+j]:
            print(pattern[j],end='')
            j+=1
            if(j==len(pattern)):
                return k
        print(pattern[j],"!=",text[k:k+j+1])
    return -1

if __name__ == '__main__':
    text = "SEE SHE SEA"
    pattern = "SEA"
    BruteForceStringMatch(text,pattern)