# Various solutions to the fibonacci problem
# Author: mikejameswhite

import time

def fib_brute_force(n):
    """ Brute force approach -- O(2^n) space and time complexity"""

    if (n == 0):
        return 0
    if (n == 1):
        return 1
    
    return fib_brute_force(n-1) + fib_brute_force(n-2)

def fib_memoization():
    """ Dynamic programming approach -- O(n) space and time complexity"""
    seen = {0:0, 1:1}

    def fib_memoization_inner(n):
        if not (n in seen):
            seen[n] = fib_memoization_inner(n-1) + fib_memoization_inner(n-2)

        return seen[n]
    
    return fib_memoization_inner

def test():
    print('Fibonnaci algorithms by mikejameswhite' + '\n' +
          '--------------------------------------' + '\n')
    
    print('Small problem size: n = 4, expected output = 3')
    start = time.time()
    value = fib_brute_force(4)
    end = time.time()
    print('Brute force output:', value)
    print('Brute force time elapsed:', end - start)

    start = time.time()
    fib = fib_memoization()
    value = fib(4)
    end = time.time()
    print('Dynamic Programming output:', value)
    print('Dynamic Programming time elapsed:', end - start)
    print()

    print('Medium problem size: n = 20, expected output = 6765')
    start = time.time()
    value = fib_brute_force(20)
    end = time.time()
    print('Brute force output:', value)
    print('Brute force time elapsed:', end - start)

    start = time.time()
    fib = fib_memoization()
    value = fib(20)
    end = time.time()
    print('Dynamic Programming output:', value)
    print('Dynamic Programming time elapsed:', end - start)
    print()

    print('Large problem size: n = 40, expected output = 102334155')
    start = time.time()
    value = fib_brute_force(40)
    end = time.time()
    print('Brute force output:', value)
    print('Brute force time elapsed:', end - start)

    start = time.time()
    fib = fib_memoization()
    value = fib(40)
    end = time.time()
    print('Dynamic Programming output:', value)
    print('Dynamic Programming time elapsed:', end - start)
    print()

if __name__ == '__main__':
    test()