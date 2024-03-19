def longest_consecutive(nums):
    if not nums:
        return 0

    nums = set(nums)
    longest_streak = 0