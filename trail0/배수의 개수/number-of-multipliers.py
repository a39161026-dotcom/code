numbers = []
for i in range(10):
    numbers.append(int(input()))

count3 = 0
count5 = 0

for i in numbers:
    if i % 3 == 0:
        count3 += 1
    if i % 5 == 0:
        count5 += 1

print(count3, count5)