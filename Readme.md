<<<<<<< HEAD
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
=======
# My LeetCode & DSA Journey

Welcome to my Data Structures and Algorithms (DSA) workspace! 

This repository is my personal library where I document my journey of solving LeetCode problems, mastering algorithms, and improving my coding problem-solving skills. 

# Goal
My main goal is to consistently practice problem-solving and write clean, efficient, and well-documented code. I don't just post the code; I try to explain my "aha!" moments, the intuition behind the solutions, and the time/space complexity so I can review them later.

# Repository Structure
Every problem has its own dedicated folder to keep things neat and organized. Inside each folder, you will generally find:
* `Solution.java`: The accepted Java code.
* `README.md`: My personal notes, intuition, approach, and complexity analysis for that specific problem.

# Tech Stack
* **Language:** Java
* **Concepts Covered:** Arrays, Prefix Sums, Binary Indexed Trees (Fenwick Trees), and more to come!

---
*"Consistency is the key to mastering algorithms."*
>>>>>>> 9b258029a5d34ce8f2afd03e851da7c5ddb3f92e
