# Recursion

## 1. Triangular numbers

### Description
A numerical series of the form 1, 3, 6, 10, 15, 21, …
We want to determine the value of an arbitrary **n**-th number in the series - for example, the 4-th (10).
<p align="center">
  <img src="https://thecode.media/wp-content/uploads/2019/05/10.jpg" height="255"/>
</p>

### The functionality of the program
* Calculating the n-th triangular number using:
  * recursions
  * cycle
* Comparison of working time

### Example
```
To output triangular numbers, enter n - the last iteration of calculations(NUMBER): 
5

Graphical representation: 
 *  *  *  *  * 
 *  *  *  * 
 *  *  * 
 *  * 
 * 
            Recursion    Cycle     
Result      15           15        
Time, ns    2100         1100      
```
## 2. Factorial

### Description
Determine the <a href="https://en.wikipedia.org/wiki/Factorial">factorial</a> of **n**-th number.

### The functionality of the program
* Calculating factorial using:
  * recursions
  * cycle
* Comparison of working time

### Example
```
Enter n (NUMBER): 
5
            Recursion    Cycle     
Result      120          120       
Time, ns    3300         1100      
```
## 3. Anagrams

### Description

It is required to make a complete list of anagrams of a given word, that is, all possible permutations of letters (regardless of whether they are valid words or not). For example, for the word *cat*, the program should output the following list of anagrams:
```
cat
cta
atc
act
tca
tac
```
### Example
```
Enter the word: 
love
  1 love   2 loev   3 lveo   4 lvoe   5 leov   6 levo 
  7 ovel   8 ovle   9 oelv  10 oevl  11 olve  12 olev 
 13 velo  14 veol  15 vloe  16 vleo  17 voel  18 vole 
 19 elov  20 elvo  21 eovl  22 eolv  23 evlo  24 evol 
```
