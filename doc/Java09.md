# Chapter09_java_pkg

---

- Object Class

![(출처 : [https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html))](img/objectClassimg.png)

(출처 : [https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html))

- equals method
    
    → 같고 다름을 참조 변수의 값으로 판단한다. 그렇기 때문에 서로 다른 두 객체를 equals로 비교하면 항상 false를 얻는다.
    
    → String 인스턴스가 갖는 문자열 값을 비교하도록 되어있어 equals method를 사용하면 항상 true를 반환한다.
    
- hashCode()
    
    → 해시 함수는 찾고자하는 값을 입력하면, 그 값이 저장된 위치를 알려주는 해시코드를 반환한다.
    
    ```java
    Object.hashCode() // 인스턴스 변수 값으로 hashCode 생산
    System.identityHashCode(Object x) // 객체의 주소값으로 hashCode 생산
    ```
    
    → 위 두 메서드를 활용해 해시코드는 같지만 서로 다른 객체라는 것을 알 수 있다.
    

- toString()
    
    → 인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의한 함수이다.
    
    → 서로 다른 인스턴스에 대해서 toString을 호출할 때 클래스의 이름은 같아도 해시코드 값이 다름을 알 수 있다.
    
    → 🍎String의 toString()은 String instance가 갖고 있는 문자열을 반환하도록 오버라이딩 되어 있어 주소 값이 출력되지 않는다.!
    

- clone()
    
    → 자신을 복제하여 새로운 인스턴스를 생성하는 일을 한다.
    
    → 새로운 인스턴스를 생성하여 작업을 하면 작업 이전의 값이 보존되어 작업에 실패해서 원래의 상태로 되돌리거나 변경되기 전의 값을 참고하는데 도움이 된다.
    
    ▪️얕은 복사(shallow copy)
    
    → 원본을 변경하면 복사본도 영향을 받는다.
    
    ▪️깊은 복사(deep copy)
    
    → 복사본이 변경사항에 영향을 받지 않는다.
    

---

- getClass()
    
    → 자신이 속한 클래스의 Class 객체를 반환하는 메서드
    
    → 클래스의 모든 정보를 담고 있으며, 클래스 당 1개만 존재한다. 클래스 파일이 메모리에 올라갈 때 자동으로 생성된다.
    
    → 즉, 클래스 파일을 읽어서 사용하기 편한 형태로 저장해 놓은 것이 클래스 객체이다.
    
    → Class 객체는 클래스의 모든 정보를 알고 있어 Class 객체를 사용해 객체를 생성할 수 있다.
    
    → 🍎 객체를 동적으로 사용하고 싶다면 reflection API를 사용
    

---

- String Class
    
    → 다른 언어와 달리 자바에선 문자열을 위한 클래스를 제공한다.
    
    → 🍎 String Class는 변경 불가능한 (immutable) 클래스이다.
    
    → 한 번 생성된 String 인스턴스가 갖고 있는 문자열은 읽어 올 수만 있고, 변경할 수는 없다.
    
    → + 연산을 진행할 경우, 인스턴스 내의 문자열이 바뀌는 것이 아닌 새로운 문자열이 담긴 인스턴스가 생성되는 것이다.
    
    → 문자열을 많이 다루는 작업에는 StringBuffer class를 사용하는 것이 좋다. 변경 가능한 문자열을 사용해 메모리를 아낄 수 있다.
    
    ❗**문자열 비교**
    
    → 문자열을 만들 때 두가지 방법, 문자열 리터럴을 지정하는 방법과 String클래스의 생성자를 사용해 만드는방법이 존재한다.
    
    ```java
    str1 = "abc";
    str2 = new String("abc");
    ```
    
    → 두 객체는 전혀 다르다.
    
    → String 클래스의 생성자를 이용한 경우에는 new 연산자에 의해 메모리할당이 이루어지기 때문에 항상 새로운 String instance가 생성된다. 그러나 문자열 리터럴은 이미 존재하는 것을 재사용하는 것이다.
    
    → 문자열 리터럴은 해당 클래스가 메모리에 올라갈 때, “상수 저장소”에 저장되며 값을 공유한다.
    
- StringBuffer Class
    
    → 내부적으로 문자열 편집을 위한 버퍼를 갖고 있으며 StringBuffer 인스턴스를 생성할 때 크기를 지정할 수 있다.
    
    → append() 호출 시 객체 자신을 반환한다.
    
- StringBuilder
    
    → StringBuffer는 멀티쓰레드에 안전하도록 동기화되어 있다. 동기화가 StringBuffer의 성능을 떨어뜨린다.
    
    → 멀티 쓰레드로 작성된 프로그램이 아닌 경우, StringBuffer의 동기화는 불필요하게 성능만 떨어뜨린다.
    
    → StringBuilder = StringBuffer - Thread 동기화.
    

---

- StaticMath Class
    
    → Math 클래스는 최대한의 성능을 얻기 위해 JVM이 설치된 OS 메서드를 호출해서 사용한다. 즉, OS에 의존적인 계산을 하고 있는 것이다.(ex, 부동 소숫점이 컴퓨터마다 결과 값이 다를 수 있다. )
    
    → 이러한 차이를 없애기 위해 성능은 다소 포기하는 대신, 어떤 OS에서 실행되어도 항상 같은 결과를 얻도록 Math 클래스를 새로 작성한 것이 StaticMath 클래스이다.
    

---

- Wrapper Class
    
    → 기본값을 객체로 다룰 수 있는 클래스
    
    → 매개변수로 객체를 요구할 때, 기본형 값이 아닌 객체로 저장해야할 때, 객체간의 비교가 필요할 때 등등의 경우에는 기본형 값들을 객체로 변환하여 작업을 수행해야 한다.
    
    → equals() 는 주소값이 아닌 객체가 갖고 있는 값을 비교한다. Integer 객체에 비교연산자를 사용할 수 없으며 대신 compareTo()를 사용한다.
    

---

- Number Class
    
    → BigInteger, BigDecimal은 더 큰 정수 범위, 더 큰 범위의 부동 소수점을 처리하기 위한 것
    
    → 클래스에 존재하는 함수에 Exact가 붙을 시 타입이 틀렸을 때, Error를 발생시킨다.
    

---

- autoBoxing, unBoxing
    
    → 기본형 값을 래퍼 클래스의 객체로 자동 변환해주는 것을 “오토박싱”이라한다.
    
    → 래퍼 클래스에서 기본형으로 변환하는 것을 “언박싱”이라 한다.
    

---

- 그 외 유용한 라이브러리
    - Objects
        
        → null 검사, 2D 배열 비교에 사용하면 유용하다.
        
    - Random Class
    - Scanner, StringTokenizer
        
        → Scanner의 split()은 빈 문자열도 토큰으로 인식하는 반면, StringTokenizer는 빈 문자열을 토큰으로 인식하지 않기 때문에 토큰의 개수가 서로 다르다.
        
    - 정규식 (Regular Expression)
        
        → 정규식이란 텍스트 데이터 중에서 원하는 조건과 일치하는 문자열을 찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해 작성한 문자열을 말한다.
        

---