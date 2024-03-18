Here is a Java console application that solves the problem:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        int[] nums = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("The length of the longest consecutive sequence is: " + longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
```

This console application first asks the user to input the length of the array and then the elements of the array. It then calls the `longestConsecutive` method to find the length of the longest consecutive sequence in the array and prints the result. The `longestConsecutive` method uses a HashSet to eliminate duplicates and to check for the existence of elements in constant time. It iterates over each element in the set and checks if it is the first element of a sequence. If it is, it then checks how long the sequence is. The length of the longest sequence is then returned.