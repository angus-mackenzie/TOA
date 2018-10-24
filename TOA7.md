# Space Time
## Sorting by Counting
Example A:
The Array is = `{13,11,12,13,12,12}`
|Array Values|11|12|13|
|---|---|---|
|Frequencies|1|3|2|
|Distribution|1|4|6|

||D[0]|D[1]

Finish

![Sorting by Counting](img/sortingbycounting.png)

# Horspool's Algorithm
* Uses a *shoft table T* with an entry per...

## Case 1
```
TEXT: A_CAT
Pattern: GECKO
```

## Case 2
```
TEXT: HE_FOUND
PATTERN: GECKO
```
If last letters match but that letter isn't in rest of pattern - move entire pattern past the last letter.
## Case 3
```
TEXT: THE C...
PATTERN: CECKO
```
## Case 4
```
TEXT: ENDURING ...
PATTERN: ENGAGING 
            ENGAGING
```
If last letters match and that letter is elsewhere in the pattern:
Align with rightmost occurence of that letter in the pattern

## On Mismatch
* If end letter isn't in the pattern, move right past it; otherwise align with rightmost occurence of that letter in the pattern

## Summarized

## Example
Create the shift table for ENGAGING
|E|N|G|A|I|
|---|---|---|---|---|
|?|?|?|?|?|
The length `m = 8`. There are 5 unique letters:
```
T(E) = m - 1 - rightmost index of E = 8 - 1 - 0 = 7
T(N) = 8-1-6= = 1
T(I) = 8 - 1 - 5 = 2
T(G) = 8 - 1 - 4 = 3
T(A) = 8 ... = 4
```
It is better to start with the rightmost occurence of a letter and work backwards
|E|N|G|A|I|
|---|---|---|---|---|
|7|1|3|4|2|

### Example 1
### Example 2
### Example 3

