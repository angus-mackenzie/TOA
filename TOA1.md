# Introduction
# What is an algorithm?
* A sequence of unambiguous instructions for solving a well-defined problem. Algorithms are guaranteed to terminate if the input is valid.
* Algorithms are a subset of procedures, which aren't guaranteed to terminate.
# Terms
* Finite
    * Terminates after a finite number of steps
* Definite
    * Rigorously and unambiguously specified
* Inputs
    * Valid inputs are clearly specified
* Output
    * Can be proved to produce the correct output given a valid input
* Effective
    * Steps are sufficiently simple and basic
# History
* 1600 BC - Babylonians developed algorithms for factorization and square roots
* Euclid developed numerous algorithms
* Printing press, invented by Gutenberg in 1448, as the most important invention in history.
* Fibonacci
    * Leonard Fibonacci, Italian
    * Responsible for introducing the decimal system in the 15th century.
    * Also made the Fibonacci series.
# Typical Algorithmic Problems
* Sorting and Searching
* String Processing
* Graph Problems
* Combinatorial Problems e.g.list all permutations
* Geometric Problems
    * Closest-Pair, Convex-Hull
    * GPS: Least number of roads to get from A to B?
* Numerical Problems
    * e.g.: Solving systems of equations, random numbers, matrix multiplication
# Types of Algorithms
* Brute Force
* Decrease & Conquer
* Divide & Conquer
* Transform & Conquer
* Trading Space & Time
* Dynamic Programming
* Greedy
* Iterative Improvement
# Algorithm Example:
Here is an extremely inefficient example of the fibonacci algorithm:
```java
public long fibo(long n){
    if (n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    return fibo(n-1)+fibo(n-2);
}
```
If you try this with `n=100`, it will take xxx nanoseconds - which is roughly xxx seconds.

Here is a better solution:
```java
public BigInteger fibo(int n){
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    BigInteger[] table = new BigInteger[3];
    table[0] = new BigInteger("0");
    table[1] = new BigInteger("1");
    for(int i = 2; i < n; i++){
        table[2] = table[1].add(table[0]);
        table[0] = table[1];
        table[1] = table[2];
    }
    return table[2];
}
```