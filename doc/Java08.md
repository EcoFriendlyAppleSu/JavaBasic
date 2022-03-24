# Chapter08_exception

---

- 예외 처리
    
    → 프로그램 실행 시 발생할 수 있는 예외에 대비한 코드를 작성하는 것
    
    → 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
    
    ▪️Error 종류
    
    1. 컴파일 에러 : 컴파일 시 발생하는 에러
    2. 런타임 에러 : 실행 시에 발생하는 에러
    3. 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것
    
    ---
    
    - 에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
    - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
        1. Exception 클래스와 그 자손들 → 사용자의 실수, 외적인 요인에 발생
            
            → checked Exception
            
        2. RuntimeException 클래스와 그 자손들 → 프로그래머의 실수로 발생
            
            → Unchecked Exception
            
    - try-catch-finally statement
        
        → try block에서 예외가 발생할 경우
        
        1. 발생한 예외와 일치하는 catch 블럭이 있는지 확인한다.
        2. 일치하는 블록을 찾게 되면, 수행 후 try-catch를 빠져나와 다음 문장 수행
        
        🍎 try-catch 마지막에 Exception Class type의 참조변수를 선언한 catch 블록을 사용하면, 어떤 종류의 예외가 발생하더라도 이 catch 블록에 의해 처리되도록 할 수 있다.
        
        → finally는 무조건 실행된다.
        
    
    - printStackTrace(), getMessage()
        
        → 예외가 발생했을 때, 생성되는 예외 클래스의 인스턴스에는 발생한 예외에 대한 정보가 담겨 있으며, 위 함수를 통해 정보를 얻을 수 있다.
        
        printStackTrace() : 예외 발생 당시의 호출 스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
        
        getMessage() : 발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
        
    
    ---
    
    - 예외 발생시키기
        1. 먼저, 연산자 new를 사용해 발생시키려는 예외 클래스의 객체를 만든다.
        2. 키워드 throw를 이용해서 예외를 발생시킨다.
    
    ```java
    Exception e = new Exception("고의로 발생");
    throw e;
    ```
    
    ---
    
    - 메서드에 예외 선언하기
        
        → 메서드의 선언부에 throws를 사용해 메서드 내에서 발생할 수 있는 예외를 적어 사용할 수 있다.
        
        ⇒ throws를 통해 예외를 적으면 메서드 내에서 처리해줘야 한다
        
    
    ---
    
    - 사용자 정의 예외 만들기
        
        → super() 생성자를 통해 부모 객체인 Exception에 접근 할 수 있다. 이를 통해 사용자 지정 예외를 만들 수 있다.
        
    - 연결된 예외
        
        ```java
        Throwable initCase(Throwable cause) // 지정한 예외를 원인 예외로 등록
        Throwable getCause() // 원인 예외를 반환
        ```