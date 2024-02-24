n = int(input("Enter n: "))
for _ in range(n):
    print("*" * 5)

m = int(input("Enter m: "))

for _ in range(m):
    for i in range(1, m+1):
        print(i, end=" ")
    print()