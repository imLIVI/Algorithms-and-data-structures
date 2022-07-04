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
# Sorting

### Description

In this folder are implemented:
 * Bubble sort
 * Sorting by choice
 * Sorting by insertion
 * Merge sort
 * Quick sort

### The functionality of the program
* Each algorithm contains a calculation of the complexity and an invariant
* Comparison of working time
<table>
  <tr>
    <th></th>
    <th colspan="4">Time, ns</th>
  </tr>
    <th>Number of elements in array</th>
    <th>n = 10</th>
    <th>n = 100</th>
    <th>n = 1000</th>
    <th>n = 10 000</th>
  </tr>
  <tr>
    <td>Bubble sort</td>
    <td>14700.0</td>
    <td>250800.0</td>
    <td>6864100.0</td>
    <td>3.046468E8</td>
  </tr>
  <tr>
    <td>Sorting by choice</td>
    <td>8800.0</td>
    <td>179600.0</td>
    <td>4055600.0</td>
    <td>1.388091E8</td>
  </tr>
  <tr>
    <td>Sorting by insertion</td>
    <td>9000.0</td>
    <td>199100.0</td>
    <td>4167900.0</td>
    <td>1.119205E8</td>
  </tr>
  <tr>
    <td>Merge sort</td>
    <td>1092700.0</td>
    <td>828200.0</td>
    <td>1724500.0</td>
    <td>7457900.0</td>
  </tr>
  <tr>
    <td>Quick sort</td>
    <td>921700.0</td>
    <td>855500.0</td>
    <td>1196700.0</td>
    <td>10650600.0</td>
  </tr>
</table>
