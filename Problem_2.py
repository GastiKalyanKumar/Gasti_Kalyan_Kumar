limit = int(input("Enter the number of terms: "))
for index in range(limit):
    value = 2 * index + 1
    if index != limit - 1:
        print(value, end=", ")
    else:
        print(value)
