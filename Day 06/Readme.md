# Majority Element II
You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array.

Note: The answer should be returned in an increasing format.

Examples:
```declarative
Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
Output: [5, 6]
Explanation: 5 and 6 occur more n/3 times.
```
```declarative
Input: arr[] = [1, 2, 3, 4, 5]
Output: []
Explanation: o candidate occur more than n/3 times.
```

## My Approach 
1. find n / 3.
2. traverse the whole array 
   1. set a counter = 0; pos = 0;
   2. for(int j = i+1; j < n; j++) {
       - if(arr[i] == arr[j])
         - counter++;
         - pos = i;
   3. check if the counter > n/3 
       - hold the value in a list 
       - list.add(arr[i])
   4. if pos > 0
        - i = pos
      
3. return the list 

## Optimal Appaoch 
Use Moore's Algorithm