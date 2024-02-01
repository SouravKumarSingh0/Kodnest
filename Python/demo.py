def Validate(n):
    return n <= 5
def duplicateMember(a, n):
    return len(a) != len(set(a))
def teamDevide(arr1, n):
    football_team = []
    basketball_team = []
    for emp_id in arr1:
        if emp_id % 2 == 0:
            football_team.append(emp_id)
        else:
            basketball_team.append(emp_id)
    print("List of employees in foot ball team are:", " ".join(map(str, football_team)))
    print("List of employees in basket ball team are:", " ".join(map(str, basketball_team)))
def main():
    arr1 = []
    n = int(input())

    for _ in range(n):
        num = int(input())
        arr1.append(num)

    if Validate(n):
        print("Number of employees participating in sports must be greater than 5")
    elif duplicateMember(arr1, n):
        print("Duplicates are present - Team members' ID should be unique")
    else:
        teamDevide(arr1, n)

main()