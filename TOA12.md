# Dynamic Programming
* Dynamic Programming is a general algorithm design technique.
* Invented to solve optimization problems in 1950s by American mathematician Richard Bellman
* "Programming" <=> "Planning"
# Fibonacci Numbers
Fibonacci Recursive function can be written as *F(n) = F(n-1)+F(n-2)*, and if we complete it wth F(6) it will look as follows:

![Fibo](img/fibowith6.png)

But Fibonacci with Dynamic Programming looks as follows:
```
A[0] =a;
A[1] = 1;
for k = 2 to n do:
    a[k] <- A[k-1] + A[k-2]
return A[n]
```
# Binomial Coefficient
The coefficient of the x<sup>k</sup> term in the polynomial expansion of the binomial power (1+x)<sup>n</sup>

![Binomial](img/binomial.png) for `n ≥ k ≥ 0`

![Binomial](img/binomial=0.png) if `k < 0` or `k > n`

![Binomial](img/binomial2.png) 

By substituting the values 33 and 3 into the above equation it would look as follow, and have the resultant general form:

![Binomial](img/binomial3.png)

# Optimal Static Binary Search Tree
# Transitive Closure: Warshall's Algorithm
# All Pairs Shortest Path: Floyd's Algorithm
# Knapsack Problem