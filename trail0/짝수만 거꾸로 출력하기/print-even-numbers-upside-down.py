n = int(input())
numbers = list(map(int, input().split()))

result = []
for i in range(n-1, -1, -1):
    if numbers[i] % 2 == 0:
        result.append(numbers[i])

print(*result)