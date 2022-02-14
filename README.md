# java-racingcar

자동차 경주 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 문자열 덧셈 계산기 요구사항

- [x]  사용자 입력 값이 공백 혹은 null인 경우 0을 반환한다.
- [x]  입력 값에 구분자가 없는 경우 숫자를 그대로 반환한다.
- [x]  컴마 혹은 콜론이 구분자로 지정되면 구분된 숫자들의 합을 반환한다.
- [x]  “//” 와 “\n” 문자 사이에 커스텀 구분자를 지정할 수 있다.
- [x]  음수 혹은 문자열이 입력값으로 들어온 경우 RuntimeException 예외를 발생시킨다.


## 1단계 - 자동차 경주 구현 요구사항

### 자동차

- 자동차 이름
    - [x]  [ERROR] 자동차의 이름이 5자가 초과될 경우 예외가 발생해야 한다.
    - [ ]  [ERROR] 자동차의 이름이 공백이 들어올 경우 예외가 발생해야 한다.
    - [ ]  [ERROR] 자동차의 이름이 null이 들어올 경우 예외가 발생해야 한다.
- 자동차 위치
    - [x]  자동차의 초기 위치는 0이 되어야 한다.

### 자동차 경주
- 자동차 모임
    - [x] 자동차의 이름은 쉼표(,) 구분된다.
- 자동차 위치 이동
    - [x]  요청된 랜덤값이 4 이상일 때 위치가 증가한다.
    - [x]  요청된 랜덤값이 3 이하일 때 위치가 변하지 않는다.
- 시도횟수
    - [x]  시도횟수를 입력받을 수 있다.
    - [x]  [ERROR] 시도횟수가 문자열로 입력될 경우 예외가 발생해야 한다. 
    - [x]  [ERROR] 시도횟수는 0이하로 입력될 수 없다.
    - [x]  시도횟수를 소진할 경우 게임이 종료된다.
    - [x]  [ERROR] 시도횟수가 0인데 게임을 진행하는 경우 예외가 발생해야 한다.
- 우승자
    - [x]  위치가 가장 높은 자동차를 반환할 수 있다.
    - [x]  우승자는 중복될 수 있다.

### 출력

- [x]  현재 자동차의 위치를 (-)로 표현할 수 있다.
- [x]  우승자가 중복될 경우 (,)로 구분지어 표현할 수 있다.