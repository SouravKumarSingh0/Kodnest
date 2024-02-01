def longestOR(mn, mx, arr):
    def countSetBits(num):
        count = 0
        while num:
            num &= num - 1
            count += 1
        return count

    longest_length = 0
    n = len(arr)

    for i in range(n):
        bitwise_or = arr[i]
        for j in range(i, n):
            bitwise_or |= arr[j]
            set_bits_count = countSetBits(bitwise_or)
            if mn <= set_bits_count <= mx:
                subarray_length = j - i + 1
                longest_length = max(longest_length, subarray_length)
            elif set_bits_count > mx: 
                break

    return longest_length


mn = int(input().strip())
mx = int(input().strip())
n = int(input().strip())
arr = []
for _ in range(n):
    arr.append(int(input().strip()))

result = longestOR(mn, mx, arr)
print("Output")
print(result)