# Modulus Practical
This practical was intended to be solved via Brute Force. Hence, the solution has a time complexity of O(n<sup>2</sup>).

However, I am getting failed tests. For Trial 3 in the automatic marker, the expected output was 0 and my program produces is 25. Likewise, for trial 5 the expected output was 0 and my program produced 133. Again for trial 6 the expected output was 0 and my program produced 1213. Please assist if you know why this is happening.

## Problem Description
Write a program that, given a positive integer N, and a non-negative integer, Z, counts the number of pairs of positive integers X and Y for which *(X \* Y)modulo N == Z*

This can also be written as *(X\*Y)%N==Z*

**Example**

Given N = 6, and Z = 3 the following pairs of integers would be counted, giving an answer of 5:
* 1,3
* 3,1
* 3,3
* 3,5
* 5,3

## Input & Output
Input consists of two lines, the first containing the integer N and the second containing the integer Z. The program must consist of a single integer representing the number of different pairs of positive integers for which the equation above stands true.

Sample input:
```
6
3
```
Sample output:
```
5
```

## Constraints
* `1 <= N <= 1000`
* `0 <= Z < N`