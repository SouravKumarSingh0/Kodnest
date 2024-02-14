english_marks = int(input("Enter the English marks: "))
maths_marks = int(input("Enter the Maths marks: "))

if maths_marks > 80 and english_marks > 80:
    print("Grade A")
elif maths_marks > 80 or english_marks > 80:
    print("Grade B")
elif maths_marks < 80 and english_marks < 80:
    print("Grade C")