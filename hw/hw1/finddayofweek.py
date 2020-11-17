year = int(input("year: "))
month = int(input("month: "))
day = int(input("day: "))
# 사용자로부터 year, month, day를 입력받음

sum_of_day = 0
# 해당 날짜의 day를 더해 줄 sum_of_day 변수 선언

for i in range(1, year):
    if (i % 100 != 0) and (i % 4 == 0) or (i % 400 == 0):  # 윤년
        sum_of_day += 366
    else:
        sum_of_day += 365
# 1부터 해당 년도까지 윤년을 판별해서 366 혹은 365를 더해 줌

if (year % 100 != 0) and (year % 4 == 0) or (year % 400 == 0):
    leap = True
else:
    leap = False
# 윤년 판별

for i in range(1, month):
    if i == 1 or i == 3 or i == 5 or i == 7 or i == 8 or i == 10 or i == 12:  # 31일인 달
        sum_of_day += 31
    elif i == 4 or i == 6 or i == 9 or i == 11:  # 30일인 달
        sum_of_day += 30
    elif i == 2:
        if leap:
            sum_of_day += 29
        else:
            sum_of_day += 28
# 1월부터 해당 월까지 31 혹은 30을 더해주고 2월 이상인 달은 윤년을 판별해서 더해 줌

sum_of_day += day
# day를 더해 줌

if sum_of_day % 7 == 0:
    print('Sunday')
elif sum_of_day % 7 == 1:
    print('Monday')
elif sum_of_day % 7 == 2:
    print('Tuesday')
elif sum_of_day % 7 == 3:
    print('Wednesday')
elif sum_of_day % 7 == 4:
    print('Thursday')
elif sum_of_day % 7 == 5:
    print('Friday')
elif sum_of_day % 7 == 6:
    print('Saturday')
# sum_of_day를 7로 나눈 나머지가 해당 요일이 되게 출력해 줌