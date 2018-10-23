def F(n):
    print(n)
    if n == 0:
        return 1
    return F(n-1)*n

if __name__ == '__main__':
    print(F(10))