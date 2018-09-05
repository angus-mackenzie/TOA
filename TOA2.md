# Theory of Algorithms
# Algorithm Efficiency
* We're interested in growth order
    * So O(n<sup>2</sup>) vs O(n<sup>3</sup>) is more important than *1412*n<sup>2</sup> vs *5*<sup>3</sup>
* We are measuring the operational complexity
* n is the data size
* For which input instance?
    * Worst case
    * Average case
    * Best case

**Example: linear search**
What is the worst case?
* worst = n
* average = n/2
* best = constant time

Generally most interested in worst case. If the best case is good enough, we are interested in that

## Typical Algorithm Efficiency Classes


# Big O -
* Algorithm executes
* `2n+10` operations
* We are not interested in 

**Example**
* Laptop sorts array of 100 million items in 30 seconds using an O(nlog<sub>2</sub>n) algorithm
* How long would it take with an n<sup>2</sup> algorithm
* n*logn = 2 657 542 476
* n = 10 000 000 000 000 000
* 10<sup>16</sup> ..

# Definition Big O
A function t(n) $\epsilon$ of O(g(n))

If there is a c and an n<sub>0</sub>
Such that t(n) <= cg(n) for all n>=n<sub>0</sub>

**Example**

100n+5 element O(n)
set say c to 101 and n<sub>0</sub> to 6
Prove 100n+5 <= 100n for all n>=6 by induction

# Omega (Not important)
* A function t(n)
* Same as Big O, except **bigger than** instead of **smaller than** sign



# Theta
* Exactly proportional to g(n)

> Big Oh is NO worse

> Big Omega is oh my god

![Big Oh Vs Theta Vs Omega](img/ohphetatheta.png)
[Check this out](https://medium.com/@.RT/total-n00bs-guide-to-big-o-big-%CF%89-big-%CE%B8-aa259ae8a1c2)