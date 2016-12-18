# Max palindrome search

This Java algorithm searches for maximum valid palindrome from multiplication of 2 n-digit numbers. n is set as a constant in code.
There are 2 solutions for this problem:
- The simplest brute force solution. Nested loops try to pick 2 multipliers that will give maximum valid result.
- Solution composes a palindrome: concatenate mirrored number to itself. 
  Then the palindrome is checked if it can be derived by multiplying 2 n-digit numbers.