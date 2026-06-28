# Intuition
A chain is built from pairs of equal values, where each pair's value is the square of the previous pair's value, ending in one leftover value. 1 is special since 1² = 1 forever, so it's handled on its own.

# Approach
Count frequency of each number (using long to avoid overflow on squaring).
For 1s: take the count, make it odd (subtract 1 if even) — that's its chain length.
For every other value, follow num → num² repeatedly: each value seen ≥2 times contributes 2 to the chain, a value seen exactly once contributes 1 and ends the chain. If the loop exits because the next squared value isn't in the map at all, subtract 1 (a pair can't be the last element).
Return the max chain length found.

## Complexity

# Time complexity:
O(n)O(n)O(n)

# Space complexity:
O(n)O(n)O(n)

# Code
```java []