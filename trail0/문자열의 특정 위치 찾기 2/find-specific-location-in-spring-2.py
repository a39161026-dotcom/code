word_list = ["apple", "banana", "grape", "blueberry", "orange"]
target_char = input()

cnt = 0

for word in word_list:
    if word[2] == target_char or word[3] == target_char:
        print(word)
        cnt += 1

# 마지막에 만족하는 문자열의 개수 출력
print(cnt)