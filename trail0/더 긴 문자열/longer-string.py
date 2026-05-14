# 공백을 기준으로 두 단어를 입력받아 리스트에 저장합니다.
word_a, word_b = input().split()

# 각 단어의 길이를 구합니다.
len_a = len(word_a)
len_b = len(word_b)

# 길이를 비교하여 출력합니다.
if len_a > len_b:
    print(f"{word_a} {len_a}")
elif len_b > len_a:
    print(f"{word_b} {len_b}")
else:
    print("same")