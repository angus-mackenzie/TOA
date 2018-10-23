# Angus Mackenzie
# Algorithms to determine if there are duplicate values in array A

# Brute Force
def isSet(A):
        for i in range(len(A)):
            for j in range(i+1,len(A)):
                    if(A[i]==A[j]):
                            return False
        return True

# Decrease & Conquer - Terrible
def isSet(A,index):
        if(index >= len(A)-1):
                return True
        for i in range(index+1, len(A)):
                if(A[i]==A[index]):
                        return False
        return isSet(A,index+1)

# Transform & Conquer - Faster than BF
def TCisSet(A):
        list.sort(A)
        for i in range(len(A)-1):
                if(A[i]==A[i+1]):
                        return False
        return True

if __name__ == '__main__':
        A = [10,2,20,5,3,4,5,5]
        print(TCisSet(A))
        B = [10,2,20,3,4,5]
        print(TCisSet(B))

