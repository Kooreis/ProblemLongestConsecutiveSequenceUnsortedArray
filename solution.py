Here is a Python console application that solves the problem:

```python
def longest_consecutive(nums):
    if not nums:
        return 0

    nums = set(nums)
    longest_streak = 0

    for num in nums:
        if num - 1 not in nums:
            current_num = num
            current_streak = 1

            while current_num + 1 in nums:
                current_num += 1
                current_streak += 1

            longest_streak = max(longest_streak, current_streak)

    return longest_streak

def main():
    nums = list(map(int, input("Enter numbers separated by space: ").split()))
    print("Longest consecutive sequence length is: ", longest_consecutive(nums))

if __name__ == "__main__":
    main()
```

This console application first asks the user to input a list of numbers separated by space. It then calls the `longest_consecutive` function with the input list of numbers. The `longest_consecutive` function finds the longest consecutive sequence in the list and returns its length. The length is then printed to the console.