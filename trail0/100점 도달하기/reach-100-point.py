# 1. 시작할 점수를 입력받습니다. (예제 1은 85, 예제 2는 94)
score = int(input())

# 2. score가 100점이 될 때까지 1씩 늘리면서 반복합니다!
while score <= 100:
    
    # [질문자님이 처음에 짜두신 완벽한 등급 기준 식]
    if score >= 90:
        result = "A"
    elif score >= 80:
        result = "B"
    elif score >= 70:
        result = "C"
    elif score >= 60:
        result = "D"
    else:
        result = "F"
        
    # 등급을 출력합니다.
    print(result, end=" ")
    
    # 3. 점수를 1씩 늘려줍니다. (85 -> 86 -> ... -> 100)
    score += 1