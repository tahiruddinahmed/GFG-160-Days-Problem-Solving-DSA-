# Rotate Array

Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :
```declarative
Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
```
```declarative
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
```
```declarative
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
```

## Approach 
🔄 Optimizing Array Rotation
When rotating an array of size n by d positions, rotating by the full length n results in the original array. So, we can optimize the number of rotations using the modulo operator:

```declarative
d = d % n;
```

📌 Example:
Let’s say n = 5:

`d = 5 → d % 5 = 0` → No rotation needed.

`d = 6 → d % 5 = 1` → Rotate by 1 position.

`d = 12 → d % 5 = 2` → Rotate by 2 positions.

🔁 Rotation Using Reverse Algorithm
To rotate an array to the left by d positions efficiently, we can use the three-step reverse algorithm:

🔧 Steps:
Reverse the first `d` elements

Reverse the remaining `n - d` elements

Reverse the entire array

🧮 Example:
```declarative
For arr = [1, 2, 3, 4, 5, 6] and d = 2, the process would be:

Reverse arr[0...1] → [2, 1, 3, 4, 5, 6]

Reverse arr[2...5] → [2, 1, 6, 5, 4, 3]

Reverse entire array → [3, 4, 5, 6, 1, 2]
```