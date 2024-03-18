Here is a C# console application that solves the problem:

```csharp
using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        Console.WriteLine(LongestConsecutive(nums));
    }

    public static int LongestConsecutive(int[] nums)
    {
        var numSet = new HashSet<int>(nums);
        int longestStreak = 0;

        foreach (int num in numSet)
        {
            if (!numSet.Contains(num - 1))
            {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.Contains(currentNum + 1))
                {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.Max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
```

This program first converts the input array into a HashSet for constant time complexity for checking the presence of an element. It then checks each number in the set. If the number is the first number of a sequence (i.e., num - 1 is not in the set), it then checks for the rest of the sequence, and keeps track of the longest sequence found.