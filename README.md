
# 코틀린을 학습하고 기록하기 위한 레지토리 입니다

## 1. 기본문법
 - print(), println()으로 Hello World 출력
 - $ 키워드
    출력할 때 문자열 내에 변수를 출력시키기 위해 주로 사용
    두 변수를 연산할 때 타입이 다르더라도 문자열타입을 제외한 다른 타입의 변수들은 자동으로 형변환을 시켜 연산 시켜준다. 
 - 한 줄 주석을 사용할 때 //, 여러 줄 주석 /* */

## 2. 변수와 자료형
   ### 2.1 자료형
   
   #### 정수 타입
     Byte, Short, Int, Long Type이 있고 크기는 각각 1바이트, 2바이트, 4바이트, 8바이트이다
     정수 리터럴의 허용범위 값은 20억까지이고 20억이 넘어갈때는 L을 붙혀준다
     L을 붙여주지 않아도 자바코드로 변환할 때 자동으로 L을 붙여 변환
     정의 후 타입을 따로 지정해주지 않아도 자동으로 Int 타입으로 지정해준다
     기본 타입은 Int
     
   #### 실수 타입
     Float, Double 타입이 있고 기본형은 Double 이다.
     f를 붙이면 Float 타입으로 정의가 가능하다
     자료형을 따로 명시해주지 않으면 Double 타입으로 정의해준다
     
   #### 문자 타입
     char 타입이고 유니코드로 한 글자를 표현
     값은 ' '로 문자를 넣으면 된다

   #### 문자열 타입
     String 타입으로 값은 " "로 문자를 넣으면 된다
     
   #### 논리 타입
     Boolean 타입으로 true, false로 표현한다

   #### 캐스팅
   - 코틀린은 멤버별로 to~ 함수를 통해 형변환을 해준다

     #### 정수형
     - toInt(), toShort(), toByte(), toLong()

     #### 실수형
     - toDouble(), toFloat()

     #### 문자형
     - toChar()

     #### 문자열
     - toString()

   ### 2.2 변수
   코틀린은 자바와 다르게 전역변수는 없으며 지역변수로 선언된다.
   변수의 타입은 초기값을 변경할 수 없는 불변 변수 Val, 변경 가능한 가변 변수 Var로 이루어져있다

   - Var
     variable을 의미하고 var 키워드로 선언
   
   - Val
     value를 의미하고 val 키워드로 선언하며 코틀린의 상수와 같은 의미이다

     #### 선언방식
     코틀린은 자료형 타입을 지정하거나 생략이 가능하다. 만약 생략을 한다면 기본 타입으로 자동으로 지정해준다.     
     - 타입 지정
       타입 변수명 : 자료형 타입 = 값
       
     - 타입 생략
       타입 변수명  = 값

     #### Null 변수
     - Null을 허용하게 해주는 연산자 ?
     - Null을 허용안해주는 연산자 !!

   
## 3.함수
 
  ### parameter
  - 함수나 메서드에 정의되는 변수
  - "파스칼 표기법"을 사용하여 정의
  - 각각의 매개변수는 명시적으로 입력
  - trailing comma
      다수의 매개변수를 표기할때 쉼표로 구분
      
   ### default arguments
   - 매개변수네는 default arguments value를 넣을 수 있다
   - 넣음으로써 과부화 수를 줄일 수 있음
   - default argument 값은 = 타입을 붙여 기본값을 설정 할 수 있다

   ### named arguments
   - argument의 이름을 함께 작성해주면, argument를 순서를 상관없이 넣을 수 있다.
   - 하나 이상의 인수에 이름을 지정할 수 있다.
   - 다수의 인자값이 있을때나 Null 값 또는 Boolean 값에 사용한다.
       
   ### method overriding 
   -항상 default parameter를 가지고 있어야한다
   - 기본 메서드를 재정의 하는경우 기본 매개변수 값을 생략해야한다.
      
   ### Unit
   - 반환값이 없는 타입
   - 반환타입을 지정하지 않는다면 Unit 타입으로 반환
   - Unit은 코틀린에서 값을 반환하지 않음을  의미
   - 자바에서는 "Void" 함수와 같다
   - Unit 타입을 생략해도 동일하다
   - 코틀린 코드를 decompile해도 void와 같은 결과가 나온다

   ### Single-expression function [단일표현식]
   - 함수에서 복잡한 연산을 하는 것이 아니라 간단한 연산을 하는 경우
   단일 표현식을 사용하여 간편하게 나타낼 수 있다.
   - = 기호 뒤에 본문을 지정이 가능
   - 반환타입 생략
   단일 표현식 함수는 코틀린에서는 자료형을 자동으로 추측해 생략이 가능하다

   ### type inference [타입추론]
   변수나 함수들을 선언할 때나 연산이 이루어질때 자료형을 코드에 명시하지 않아도 코틀린이 자료형을 추론해주는 기 
   능
   
   ### Nothing
   
## 4. 객체지향
   - 개체에 대한 여러 정보들을 담는다

  ### 클래스
  
   #### Any
   ##### 코틀린에서 모든 클래스의 슈퍼 클래스
   
   ##### 생성자
   - 새로운 인스턴스를 만들기 위해 호출하는 함수
      
   ###### 역할
   - 인스턴스 초기화
   - 구문 수행
   - init과 constructor 두개의 함수를 이용해 초기화 할 수 있다.

   ###### 주 생성자
   - 주 생성자는 하나밖에 생성이 가능하다
   - 클래스 이름 옆에 괄호안에 매개변수를 명시해주면 주 생성자가 된다
   - 파라미터 앞에 var, val 타입을 지정을 해주면 프로퍼티 정의와 초기화를 간략히 할 수 있다.
   - constroctor 키워드를 생략가능
   -  초기화는 init 내에서 한다
   
   ##### init 함수
   - 멤버 변수들을 초기화 할 때 사용된다

   ###### Constructor 함수 [부생정자]
   - 부 생성자로 사용한다.
   - 부 생성자는 여러 개 만들 수 있으며 매개 변수의 개수에 따라 메서드 오버라이딩이 가능하다.
   - constructor 함수를 만들경우 init 함수를 먼저 초기화 해야한다
   
## 5. 제어문

   ### IF문
   [If문](https://github.com/Seol0716/Kotlin-basic/blob/main/pratice/control/if_else/if-else)
   
   ### When
   [When](https://github.com/Seol0716/Kotlin-basic/blob/main/pratice/control/when/when)
   
   ### For문
   [For문](https://github.com/Seol0716/Kotlin-basic/tree/main/pratice/control/loop)
   
   ### 구문
   [구문](https://github.com/Seol0716/Kotlin-basic/tree/main/pratice/control/loop_study/loop_study2)
   
