20171664 소프트웨어학부 이범석



# HW1 요일 구하기

안녕하십니까 교수님!

저는 군생활을 마치고 2020년 1학기에 복학하게 된 소프트웨어학부 이범석입니다. 

코로나-19 바이러스 때문에 모두가 힘든 상황이지만 한 학기 동안 열심히 수업에 임해서 많은 지식을 얻어가겠습니다.

한 학기 동안 잘 부탁드립니다!

---



## 알고리즘

다음은 요일 구하기에 대한 알고리즘이다.

1. 사용자로부터 year, month, day를 입력받는다.
2. 입력받은 날을 모두 더해 줄 sum_of_day 변수를 만들고 0으로 초기화한다.
3. for문을 이용하여 해당 년도까지 윤년을 계산해서 365 혹은 366을 더해준다.
4. 윤년일 경우 True, 평년일 경우 False를 leap 변수에 저장해준다.
5. 입력받은 달까지 날짜를 더해 주고, 2월은 윤년이 True면 29일, False면 28일을 더해주는 for문을 작성한다.
6. sum_of_day에 입력받은 day를 더해 준다.
7. sum_of_day를 7로 나눠서 나머지가 0, 1, 2, 3, 4, 5, 6 일때 일요일, 월요일, 화요일, 수요일, 목요일, 금요일, 토요일을 print 해준다.

------



## 구현 명세

사용자가 요일을 구하고 싶은 해당 년, 월, 일을 입력하면 요일을 출력해준다.

프로그램 구동 시 발생하는 시나리오는 다음과 같다.

1. 사용자는 순서대로 년, 월, 일을 입력한다.
2. 해당 요일을 출력한다.



### 개발 환경

OS: Ubuntu 18.04 LTS
Runtime: Python>=3.6.9, javac>=11.0.6

-----



### python 코드 구현 명세

아래는 요일 구하기 python 코드에 대한 구현 명세이다.

- 사용자로부터 year, month, day를 입력받는다.

```python
year = int(input("year: "))
month = int(input("month: "))
day = int(input("day: "))
```

- 요일을 최종적으로 계산해줄 sum_of_day 변수를 만들고 0으로 초기화한다.
```python
sum_of_day = 0
```

- for문을 이용하여 1년부터 해당 년도까지 윤년을 판별해서 366 혹은 365를 sum_of_day 변수에 저장한다.

```python
for i in range(1, year):
    if (i % 100 != 0) and (i % 4 == 0) or (i % 400 == 0):  # 윤년
        sum_of_day += 366
    else:
        sum_of_day += 365
```

- year이 윤년인지 판별하고 leap 변수에 True, False를 넣어 준다.

```python
if (year % 100 != 0) and (year % 4 == 0) or (year % 400 == 0): #윤년
    leap = True
else:
    leap = False
```

- for문을 이용하여 1월부터 해당 월까지 31 혹은 30을 더해주고 2월 이상인 달은 윤년을 판별해서 더해 준다.

```python
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
```

- sum_of_day 변수에 day를 저장해준다.
```python
sum_of_day = day
```

- sum_of_day를 7로 나눈 나머지가 해당 요일이 되게 출력해준다.

```python
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
```

------



### java 코드 구현 명세

아래는 요일 구하기 java 코드에 대한 구현 명세이다.

- Scanner를 import 해준다.

```java
import java.util.Scanner;
```

- public형 finddayofweek와 main 메소드를 만들어 준다.

```java
public class finddayofweek {
    public static void main(String[] args){
        
    }
}
```

- int형 변수 year, month, day, sum_of_day, boolean형 변수 leap를 선언해준다.

```java
int year;
int month;
int day;
int sum_of_day = 0;
boolean leap;
```

- 년, 월, 일을 입력하라는 명세를 해주고, 사용자로부터 입력받은 값을 해당 변수에 저장한다.

```java
System.out.println("year: ");
year = sc.nextInt();
System.out.println("month: ");
month = sc.nextInt();
System.out.println("day: ");
day = sc.nextInt();
```

- for문을 이용하여 1년부터 해당 년도까지 윤년을 판별해서 366 혹은 365를 sum_of_day 변수에 저장한다.

```java
for (int i = 1; i < year; i++) {
    if ((i % 100 != 0) && (i % 4 == 0) || (i % 400 == 0)) {
        sum_of_day += 366;
    } else {
        sum_of_day += 365;
    }
}
```

- year이 윤년인지 판별하고 leap 변수에 True, False를 넣어 준다.

```java
if ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0)) {
    leap = true;
} else {
    leap = false;
}
```

- for문을 이용하여 1월부터 해당 월까지 31 혹은 30을 더해주고 2월 이상인 달은 윤년을 판별해서 더해 준다.

```java
for (int i = 1; i < month; i++) {
    if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12)) {
        sum_of_day += 31;
    } else if ((i == 4) || (i == 6) || (i == 9) || (i == 11)) {
		sum_of_day += 30;
	} else if (i == 2) {
		if (leap == true) {
            sum_of_day += 29;
        } else {
            sum_of_day += 28;
        }
    }
}
```

- sum_of_day에 day를 더해 준다.

```java
sum_of_day += day;
```

- sum_of_day를 7로 나눈 나머지가 해당 요일이 되게 출력해준다.

```java
if (sum_of_day % 7 == 0) {
	System.out.println("Sunday");
} else if (sum_of_day % 7 == 1) {
	System.out.println("Monday");
} else if (sum_of_day % 7 == 2) {
    System.out.println("Tuesday");
} else if (sum_of_day % 7 == 3) {
    System.out.println("Wednesday");
} else if (sum_of_day % 7 == 4) {
 	System.out.println("Thursday");
} else if (sum_of_day % 7 == 5) {
	System.out.println("Friday");
} else if (sum_of_day % 7 == 6) {
	System.out.println("Saturday");
}
```

------



긴 글 읽어 주셔서 감사합니다.



------

이범석

국민대학교 소프트웨어학부, 20171664

Mobile 010-6401-6042

qpwoeiru6486@gmail.com

ijkoo16@kookmin.ac.kr