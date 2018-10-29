# Practice
This document has some question and answers in order to test knowledge on the subject of TOA, please attempt the question before looking at the answer.
# 2017 Theory Of Algorithms
**Question 1**
1. Briefly explain the techniques below. Be sure the difference between the two problem-solving strategies in each pair is clear. (6)
    1. Divide-and-conquer and decrease-and-conquer
    2. Space-and-time tradeoff and problem reduction
    3. Dynamic programming (DP) and DP with memory functions


<details>
<summary>View answer 1.1</summary>
Divide and conquer is to solve a problem by combining solutions of smaller subproblems.

Decrease-conquer means to solve a problem by solving smaller instance of that same problem 
</details>

<details>
<summary>View answer 1.2</summary>
Space-and-time tradeoff is when you solve a problem faster by using more space (or vice versa, if space is the problem). 

Problem reduction is when you solve problem A by transforming it into another problem B.
</details>
<details>
<summary>View answer 1.3</summary>
DP is when you solve a problem by combining solutions of overlapping smaller subproblems.

DP with memory functions is as above, but proceed top down instead of bottom up
</details>

2. State whether each of the following is true or false:
<details>
<summary>Θ (n + logn) = Θ(n)</summary>
True
</details>
<details>
<summary>O (nlogn) = O(n)</summary>
False
</details>
<details>
<summary>if p ∈ O (n log n) then p ∈ O (n<sup>2</sup>)</summary>
True
</details>
<details>
<summary>if p ∈ Θ (n log n) then p ∈ Θ (n<sup>2</sup>)</summary>
False
</details>
<details>
<summary>if p ∈ Ω (n log n) then p ∈ Ω (n)</summary>
True
</details>

3. Exponentiation function a<sup>n</sup> calculates a to the power n. Show how the problem of find a<sup>n</sup> is tackled using each of the following techniques:
    1. Brute Force
    2. Decrease by a constant
    3. Decrease by a constant factor
    4. Divide & Conquer
<details>
<summary>Brute Force</summary>
a * a * a * ... * a (n times)
</details>

<details>
<summary>Decrease by a constant</summary>
a<sup>n-1</sup>*a
</details>

<details>
<summary>Decrease by a constant factor</summary>
(a<sup>n/2</sup>)<sup>2</sup>
</details>

<details>
<summary>Divide & Conquer</summary>
a<sup>n/2</sup> * a<sup>n/2</sup>
</details>

4. Use the Master Theorem to find the complexity of the function below, show your working, and remember that the Master Theorem is as follows:

if T(n) = aT(n/b) + f(n) and f(n) ∈ Θ (n<sup>2</sup>) then:
* T(n) ∈ Θ(n<sup>d</sup>) if a < b<sup>d</sup>
* T(n) ∈ Θ(n<sup>d</sup>logn) if a = b<sup>d</sup>
* T(n) ∈ Θ(n<sup>log<sub>b</sub>a</sup>) if a > b<sup>d</sup>

The function looks like this:
```
waat(x):
    if x < 3:
        return a
    else:
         return waat (2x/3) ++ waat(2x/3)
```
<details>
<summary>Answer</summary>
If we look at the function, we can put it into the form of the Master Theorem. We can see that: a = 2, b = 3/2 and that d is equal to 0. Thus if we put these into the equation a = b<sup>d</sup> it will be equal to: 2 = 3/2<sup>0</sup>. Thus a > b<sup>d</sup>. Therefore, T(n) ∈ Θ(n<sup>log<sub>3/2</sub>2</sup>)
</details>

**Question 2**</p>
1. 