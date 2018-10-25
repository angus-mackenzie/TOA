- [Transform and Conquer](#transform-and-conquer)
- [Instance Simplification](#instance-simplification)
    - [Presorting](#presorting)
- [Representation Chance](#representation-chance)
    - [Trees](#trees)
    - [Heapsort](#heapsort)
    - [Calculating Polynomials](#calculating-polynomials)
        - [Brute Force Polynomial](#brute-force-polynomial)
        - [Horner's Rule](#horners-rule)

# Transform and Conquer 
> The secret of life is to replace one worry with another

👆 Charles M. Schultz

![Transform & Conquer](img/transformandconquer.png)

Different types of transformations:
1. Instance simplification = a more convenient instance of the same problem
    * Presorting
    * Gaussian elimination
2. Representation Change = a different representation of the same instance
    * Balanced search trees
    * Heaps and heapsort
    * Polynomial evaluation by Horner's rule
    * Binary exponentiation
3. Problem reduction = a different problem altogether
    * Lowest Common Multiple
    * Reductions to graph problem
* Pre-sorting
    * Closest pair
    * Convex hull

# Instance Simplification
## Presorting
* Solve instance of problem by preprocessing the problem to transform it into another simpler/easier instance of the same problem
* Many problems involving lists are easier when list is sorted
    * Searching
    * Computing the median (selection problem)
    * Finding repeated elements
    * Convex hull & Closest Pair
* Efficiency
    * Introduce the overhead of an Θ(nlogn) preprocess
    * But the sorted problem often improves by at least one base efficiency class over the unsorted problem (e.g.: Θ(n<sup>2</sup>) -> Θ(n))

 **Example** sorting is Θ(nlogn) so transformation to sorting is only worthwhile if other algorithms are less efficient
 * Checking uniqueness
    * Brute force is Θ(n<sup>2</sup>) so sorting is more efficient
* Finding the mode
    * Brute force is Θ(n<sup>2</sup>) so sorting is more effective
* Searching an array
    * Brute force is Θ(n) so sorting is not better

**Example** Finding Repeated Elements
* Presorting algorithm for finding duplicated elements in a list
    * Use mergesort Θ(nlogn)
    * Scan to find repeated element: Θ(n)
* Brute force algorithm
    * Compare each element to every other: Θ(n<sup>2</sup>) 
* Conclusion: presorting yields **significant** improvement

**Example** Presorted selection
* Finding the k<sup>th</sup> smallest element in A[1], ..., A[n]
* Special cases
    * Min: k = 1
    * Max: k = n
    * Median: k = n/2
* Presorting-based algorithm
    * Sort list
    * return A[k]
* Partition-based algorithm (Variable Decrease & Conquer)

```
pivot/split A[s] usingPartitioning algorithm from Quicksort
if s == k:
    return A[s]
else if s< k:
    repeat with sublist A[s+1], ..., A[n]
else if s>k repeat with sublist A[1], ..., A[s-1]
```

IF we look at this algorith:
* the presorting based one is Θ(nlogn) + Θ(1) = Θ(nlogn)
* The partitioning based algorithm (which is variable size decrease & conquer)
    * Worst case T(n) = T(n-1) + (n+1) ∈ Θ (n<sup>2</sup>)
    * Best case: Θ(n)
    * Average case: T(n) = T(n/2) + (n+1) ∈ Θ (n)
    * Also identifies the k smallest elements (not just the k<sup>th</sup>)
* Simpler linear (brute force) algorithm is better in the case of max & min
* Conclusion
    * Presorting does not help in this case

# Representation Chance
## Trees
* Searching, insertion and deletion in a  Binary Search Tree:
    * Balanced = Θ(logn)
    * Unbalanced = Θ(n)
* Instance Simplification
    * AVL & Red-black trees constrain imbalances by restructuring trees using rotations
* Representation Change
    * B+ Trees attain perfect balance by allowing more than one element in a node

## Heapsort
* A heap is binary tree with conditions
    * It is essentially complete
    * The key at each node is >= keys at its children
    * The root has the largest key
    * The subtree rooted at any node of a heap is also a heap
* Heapsort algorithm
    1. Build heap
    2. Remove root - exchange with last (rightmost) leaf
    3. Fix up heap (excluding last leaf)
    4. Repeat 2,3 until heap contains just one node
* Efficiency
    * Θ(n) + Θ(nlogn) in both worst and average cases
    * Unlike mergesort it is in place
## Calculating Polynomials
Here is an example of a polynomial (p(x)), and the associated calculation for p(3)

p(x) = 2x<sup>4</sup> - x<sup>3</sup> + 3x<sup>2</sup> + x - 5
* Evaluate for x = 3

The traditional, obvious, brute force way:
p(3) = 2(3)<sup>4</sup> - (3)<sup>3</sup> + 3(3)<sup>2</sup> + (3) - 5
### Brute Force Polynomial
* For a polynomial of size n, just the first term a<sub>n</sub>x<sup>n</sup> requires n multiplications using brute force
* We can improve on this by efficiently calculating x<sup>n</sup>
* But Horner's rule does even better for large polynomials and it's dead easy

### Horner's Rule
Factor x out as much as possible - so using the same equation as above we can factor out x as follows:</p>
p(x) = 2x<sup>4</sup> - x<sup>3</sup> + 3x<sup>2</sup> + x - 5
= (2x<sup>3</sup> - x<sup>2</sup>+3x+ 1)x - 5
=((2x<sup>2</sup> - x + 3)x+1)x-5
=(((2x-1)x+3)x+1)x-5</p>
Here is another example:
p(x) = 2x<sup>3</sup> 