# Time and Space Complexity

- The number of times a block of code or a program runs is dependent on the input size.
- The nunning time of an algorithm is also dependent on input size.
- The relation between them maybe either linear,quadratic or cubic.

<img width="2024" height="1232" alt="image" src="https://github.com/user-attachments/assets/01df5529-7e45-4de1-92f6-a8509efffc60" />

## Time Complexity

- Time complexity is a way to measure how much time an algorithm takes to run, depending on the size of the input.
- It tells you how fast or slow an algorithm grows as the input grows.
- Time comlpexity is directly proportional to input size.

### 📊 Case Analysis of Algorithms 

Case analysis means evaluating how an algorithm performs under different types of input scenarios — typically by analyzing:

- Best Case

- Average Case

- Worst Case

This gives us a complete understanding of how the algorithm behaves, instead of just looking at one situation.

| Case             | Description                                               |
| ---------------- | --------------------------------------------------------- |
| **Best Case**    | The **quickest** the algorithm can solve the problem      |
| **Average Case** | The **typical** time it takes for a randomly chosen input |
| **Worst Case**   | The **slowest** the algorithm could possibly be           |


- We can derive the best case and average case time complexity but we always consider the worst case time complexity,because it provides a guaranteed upper bound on an algorithm’s running time, ensuring that no matter what input is given, the algorithm will not perform worse than this bound.
- In many real-world cases, you can’t predict the type of input the system will get. Worst-case ensures you’re prepared for the worst possible scenario.
- 
