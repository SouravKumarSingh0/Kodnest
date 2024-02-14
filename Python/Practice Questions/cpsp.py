cp = int(input("Enter the number of Cp: "))
sp = int(input("Enter the number of Sp: "))
if cp < sp:
    profit = sp - cp
    print("Profit: ", profit)
elif sp < cp:
    loss = cp-sp
    print("loss: ", loss)
else:
    print("No Profit or Loss")
