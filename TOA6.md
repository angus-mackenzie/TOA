# Decrease & Conquer
* Decrease by a constant
* Decrease by a constant factor
* Variable size decrease

# QuickHull Algorithm
## Finding the Furthest Point
* Given three points the plane p1, p2, p3
* Area of a Triangle = p1p2p3 = 1/2 det D
* D = 

<a href="https://www.codecogs.com/eqnedit.php?latex=\begin{bmatrix}&space;x_1&space;&&space;y_1&space;&&space;1\\&space;x_2&space;&&space;y_2&space;&&space;1\\&space;x_3&space;&&space;y_3&space;&&space;1&space;\end{bmatrix}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\begin{bmatrix}&space;x_1&space;&&space;y_1&space;&&space;1\\&space;x_2&space;&&space;y_2&space;&&space;1\\&space;x_3&space;&&space;y_3&space;&&space;1&space;\end{bmatrix}" title="\begin{bmatrix} x_1 & y_1 & 1\\ x_2 & y_2 & 1\\ x_3 & y_3 & 1 \end{bmatrix}" /></a>

# Decrease by a Constant Factor
* Problem
    * Among n coins, one is fake (and weighs less)
    * We have a balance scale which can compare any two sets
* Algorithm
    * Divide into two size [n/2] piles (keeping a coin aside if n is odd)
    * If they weigh the same then the extra coin is fake
* Can we do better?
    * Decrease by factor of three

# Multiplication a la Russe
When someone invaded Russia they realized that the Russians did not multiply like they did, rather they used the following method:
* `n * m (n/2) * (2m)` <- even
* `((n-1)/2)*(2m)*m` <- odd

Using doubling and halving instead of multiplication is efficient in hardware as it is just shift operations.

# Euclid's GCD
Covered this problem initially in the [first lecture](TOA1.md), but it is a good example of Variable-Size Decrease.
## Variable-Size Decrease
* Problem
    * Greatest Common Divisor of two integers `m` and `n` is the largest integer that divides both exactly
* Euclid's Solution
    * `gcd(m,n) = gcd(n,m mod n)`
    * `gcd(m,0) = m`
    * Right-side args are smaller by neither a constant size nor a constant factor
* Example:
    * `gcd(60,24) = gcd(24,12) = gcd(12,0) = 12`
    * `gcd(24,60) = gcd(60,24) = gcd(24,12) = gcd(12,0) = 12`
    * This is a variable-size decrease as changing the `n` and `m` around 
# Finding the k'th order statistic
E.g.: Finding the median. Can use a decrease and 

# Linear Interpolation Sort
Variable Size Decrease, depends on the particular string you are looking for.
* Assume values between leftmost (A[b]) and rightmost (A[u]) elements increase linearly
* To find v
    * Binary Search with "Floating variables" at index i
    * Setup straight line through (b, A[b]) and (u,A[u])
    * Find point P = (x,y) on line at y = v, then i = x
    * x = b + ...

log(logn) efficiency <- Proof

# Strengths and Weaknesses of Decrease and Conquer

# Transform and Conquer 
This should probably be in the next summary
* Pre-sorting
    * Closest pair
    * Convex hull
    * 