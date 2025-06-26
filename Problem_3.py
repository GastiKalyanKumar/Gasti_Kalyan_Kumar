x = int(input("Enter a number: "))
if x % 2 == 0:
    x -= 1
for i in range(x):
    odd = 2 * i + 1
    if i < x - 1:
        print(odd, end=", ")
    else:
        print(odd)
