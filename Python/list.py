# Create an list
my_list = [2, 4, 5, 6, 8]

# Add an element to the end of the list
my_list.append(5)
# Output: [2, 4, 5, 6, 8, 5]

# Insert an element at a specific index
my_list.insert(2, 10)
# Output: [2, 4, 10, 5, 6, 8]

# Extend the list by appending elements from another iterable
my_list.extend([3, 7, 9])

# Remove the first occurrence of a value
my_list.remove(5)

# Remove and return the last element of the list
last_element = my_list.pop()

# Get the index of the first occurrence of a value
index = my_list.index(7)

# Count the number of occurrences of a value in the list
count = my_list.count(10)

# Sort the list in ascending order
my_list.sort()

# Sort the list in descending order
my_list.sort(reverse=True)

# Reverse the elements of the list
my_list.reverse()

# Copy the list (shallow copy)
copied_list = my_list.copy()

# Clear all elements from the list
my_list.clear()

# Check if a value is present in the list
is_present = 7 in my_list

# Iterate over the elements of the list
for element in my_list:
    print(element)

#In list we can store homogeneous as well as heterogeneous type of data.
l1 = [10, 20, 30, 40, 50, 60]
l2 = [True, 7+8j, 89.5, False]
l3 = l1 + l2
print(l3)
#[10, 20, 30, 40, 50, 60, True, (7+8j), 89.5, False]


