while True:
    num = int(input())  # 입력받은 값을 num이라는 변수에 저장했어요
    
    if num == 25:      # 만약 입력받은 값이 25와 같다면?
        print("Good")
        break
        
    elif num < 25:     # 만약 25보다 작다면?
        print("Higher")
        
    else:              # 그 외에 25보다 크다면?
        print("Lower")