# Angus Mackenzie
# Greatest Common Devisor

# Euclid's Solution
def GCD(m, n):
    print(m,n)
    if(n==0):
        return m
    return GCD(n,m%n)

# Brute Force Solution
def GCD2(m,n):
    t = min(m,n)
    while(True):
        print(t)
        if(m % t == 0):
            if(n % t ==0):
                return t
        t = t - 1

def GCD3(m,n):
    while(n!=0):
        print(m,n)
        r = m % n
        m = n
        n = r
    return m

def test():
    print("Euclid's Method:")
    print(GCD(60,42))
    print("Brute Force:")
    print(GCD2(60,42))
    print("Modulus:")
    print(GCD3(60,42))
if __name__ == '__main__':
    test()
