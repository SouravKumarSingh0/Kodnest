#arithmetic operator
print("sum :", 5+6)
print("floor division: ", 11 // 7)

#assignment operators

n1 = 10
n2 = 18
print (n1>n2)

#logical operators
e1 = 2 > 1
e2 = 5 < 8
print("e1 and e2: ", e1 and e2) #e1 and e2:  True
print (" not e1: ", not(e1)) # not e1:  False

#identity operators
x = 9
y = 7
print("if x is y :", x is y)     #if x is y : False
print("if x is not y:", x is not y) #if x is not y: True


#Membership operators
x = [2, 5, 6, 9, 10, 11, 12]
print("check 5 is present in x ", 5 in x) # True
print("check 3 is not present in x", 3 not in x) # True

#Bitwise operators

x = 10
y = 5
print("x & y: ", x & y) # 4
print("x | y: ", x | y) # 15
print("x ^ y: ", x ^ y) # 15
print("x << y: ", x << y) #320
print("x >>= y: ", x >> y) #0