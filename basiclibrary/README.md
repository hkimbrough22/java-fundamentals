# Basic Library

**Author**: Haustin Kimbrough
**Version**: 1.0.1

Displays most recent changes first.

### Lab 03
#### Feature 01 - Analyzing Weather Data
Use the October Seattle weather data below. Iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.

```Javascript
// Daily average temperatures for Seattle, October 1-28 2017
int[][] weeklyMonthTemperatures = {
{66, 64, 58, 65, 71, 57, 60},
{57, 65, 65, 70, 72, 65, 51},
{55, 54, 60, 53, 59, 57, 61},
{65, 56, 55, 52, 55, 62, 57}
};
```

Should return:

```Javascript
High: 72
Low: 51
Never saw temperature: 63
Never saw temperature: 67
Never saw temperature: 68
Never saw temperature: 69
```

#### Feature 02 - Tallying Election
Accepts a List of Strings representing votes and returns one string to show what got the most votes.

### Lab 02
#### Feature 01 - Rolling Dice
Accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

#### Feature 02 - Contains Duplicates
Returns true or false depending on whether the array contains duplicate values.

#### Feature 03 - Calculating Averages
Accepts an array of integers and calculates and returns the average of all the values in the array.

#### Feature 04 - Array of Arrays
Given an array of arrays, calculates the average value for each array and return the array with the lowest average.

### Lab 01

#### Feature 01 - Pluralize
Accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

#### Feature 02 - Flipping Coins
Accepts an integer "n" and flips coins until "n" number of heads are flipped in a row.
This is a simulated coin flip by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads.
Print out heads or tails on one line for each flip. Print "It took *numFlips* flips to flip "*N*" heads in a row."

#### Feature 03 - Command Line Clock
Uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.