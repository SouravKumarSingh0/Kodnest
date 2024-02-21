num1 = int(input("Enter the number1: "))
num2 = int(input("Enter the number2: "))

operator = input("Enter the operator: ")

match operator:
    case "+":
        print(num1 + num2)
    case "-":
        print(num1 - num2)
    case "*":
        print(num1 * num2)
    case "/":
        print(num1 / num2)
    case "%":
        print(num1 % num2)
    case "**":
        print(num1 ** num2)
    case _ :
        print("Invalid operator")