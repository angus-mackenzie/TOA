# Brute Force
|Name|Efficiency|Notes|
|---|---|---|
|Towers of Hanoi|O(2<sup>n</sup>)||
|Selection Sort|O(n<sup>2</sup>)||
|Bubble Sort|O(n<sup>2</sup>)||
|String Matching|O(m * n)|m = text, n = pattern|
|Closest Pair|O(n<sup>2</sup>)||
|Convex Hull|O(n<sup>3</sup>)||
|Travelling Salesman Problem|O(n!)||
|Cheapest Job Assignment|O(n!)||
|Knapsack|O(2<sup>n</sup>)||
|Matrix Multiplication|O(n<sup>3</sup>)||
|Polynomial Evaluation|O(n<sup>2</sup>)||

# Decrease and Conquer
|Name|Efficiency|Notes|
|---|---|---|
|Insertion Sort|O(n<sup>2</sup>|Decrease by constant|
|Fake Coin Problem|O(logn)|Decrease by constant factor|
|Euclid's GCD|O(logn)|Variable size decrease|
|Interpolation Sort|O(loglogn+1) average, O(n) worst|


# Divide & Conquer
|Name|Efficiency|Notes|
|---|---|---|
|Matrix Multiplication|O(n<sup>3</sup>)||
|Strassen Method|O(n<sup>2.8</sup>)|7T(n/2) + n<sup>2</sup> recurrence|
|Closest Pair|O(nlogn)|Presorting is O(logn), every other step is O(n)|
|Convex Hull|O(nlogn) average, O(n<sup>2</sup>) worst|
|Binomial Coefficient|O(2<sup>n</sup>)||

# Transform & Conquer
|Name|Efficiency|Notes|
|---|---|---|
|Horner's Rule|O(n)|Polynomial evaluation|


# Space Time & DP
|Type|Worst Case|Best Case|Notes|
|---|---|---|---|
|Horspool|O(nm)|Θ(n)|Faster on average than brute-force, often at least as efficient as Boyer-Moore|
|Binomial Coefficient|O(n<sup>2</sup>)|O(n * k)||
|Warshall|O(n<sup>3</sup>)|O(n<sup>3</sup>)|The space complexity can possibly be O(n<sup>2</sup>)|
|Floyd|O(n<sup>3</sup>)|O(n<sup>3</sup>)||