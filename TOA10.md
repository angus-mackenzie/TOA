# Space-Time
## Tradeoff example
For many problems some extra space really pays off
* Hashing
* B-Trees
* Sorting
* Horspool's and Boyer-Moore's Algorithms for String Matching
* Dynamic Programming
# Boyer-Moore's
## Prefix and Suffix
Prefix is whatever is at the beginning of the word. Suffix is whatever is at the end of the word.
## Consider
```
TEXT:       ???SER
Pattern:    BARBER

Horspool will do this:
???SER
   BARBER
```
We know the letter where we fail, and that may be more important to us. Instead of looking at the last letter, we can look at the letter we are failing. Thus, in the example above, since S is not in BARBER we can just shift the entire string past the S:
```
???SER
   BARBER
```
**Further Example** Create the shift table for ERBER
|B|R|E|
|---|---|---|
|2|3|1|
```
Text:    ??SER
PATTERN: ERBER
```
We ned to keep track how many we have matched, and subtract that from the amount we need to do. This is because in Boyer-moore you need to take into account the letters you have matched.
## Bad Character Shift
Above was an example of a **Bad character shift**
* Let m = length of string
* Let T = shift table as in Horspool
* Let k = number of matched chars from back
* Let c = mismatched char in text
    * Bad shift = 
### Bad Char Shift v Horspool

## Good Shift Table