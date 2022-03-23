# Chapter07_OOP_02

---

- 상속
    
    상속이란, 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.
    
    → 코드의 중복을 제거해 생산성과 유지보수에 크게 기여한다.
    
    → 생성자와 초기화 블럭은 상속되지 않는다. 맴버변수만 상속된다. (static member TEST)
    
    → 자손 클래스의 맴버 개수는 조상 클래스보다 항상 같거나 많다.
    
    → 클래스 관계에서 형제와 같은 것은 없다. 부모와 자식의 관계만이 존재
    
    ![상속관계 메모리](img/oop2.png)
    
    → 자손 클래스의 인스턴스를 생성하면 조상 클래스의 맴버도 함께 생성되기 때문에 따로 조상 클래스의 인스턴스를 생성하지 않고도 조상 클래스의 맴버들을 사용할 수 있다.
    
    ---
    
    - 클래스 간의 관계 - 포함관계
        
        → 상속이외에도 포함관계를 맺어 확장시킬 수 있다.
        
        → 하나의 거대한 클래스를 작성하는 것보다 단위별로 여러 개의 클래스를 작성한 다음, 이 단위 클래스들을 포함관계로 재사용하면 보다 간결하고 손쉽게 클래스를 작성할 수 있다.
        
        → is-a, has-a로 상속과 포함관계를 구분할 수 있다.
        
    - 단일 상속
        
        → 자바에서는 오직 단일 상속만을 허용한다.
        
        → 다중 상속은 클래스간의 관계가 매우 복잡해지고 상속받은 맴버간의 이름이 같은 경우 구별할 수 있는 방법이 없다는 단점을 갖고 있다.
        
        → 다중 상속 대신 클래스를 포함 관계로 끌고와 사용하는 방식으로 해결한다.
        
    - Object class
        
        → Object 클래스는 모든 클래스 상속계층도의 최상위에 있는 조상 클래스이다.
        
        → import를 사용하지 않아도 toString, equals method를 사용할 수 있는 이유는 확장이 숨겨져 있다.
        
    
    ---
    
    - 오버라이딩
        
        → 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것을 오버라이딩이라고 한다.
        
        - 오버라이딩 방법
            1. 이름이 같아야 한다.
            2. 매개변수가 같아야 한다.
            3. 반환타입이 같아야 한다.
        
        → 접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경 할 수 있다.
        
        ⇒ 대부분의 경우 같은 범위의 접근 제어자를 사용한다.
        
        → 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
        
        → 인스턴스메서드를 static 메서드로 또는 그 반대로 변경할 수 없다.
        
        ⁉️ 조상 클래스에 정의된 static메서드를 자손 클래스에서 똑같은 이름의 static 메서드로 정의할 수 있나? → 가능하다. 하지만, static method는 오버라이딩이 아니다. static 맴버들은 자신들이 정의된 클래스에 묶여있다고 생각하자.
        
    
    ---
    
    - Super
        
        → super는 자손 클래스에서 조장 클래스로부터 상속받은 맴버를 참조하는데 사용되는 참조 변수이다.
        
        → 조상 클래스의 맴버와 자손 클래스의 맴버가 중복 정의되어 서로 구별해야하는 경우에만 super를 사용하는 것이 좋다.
        
        → static method는 인스턴스와 관련 없다. 그래서 this와 마찬가지로 super역시 static 메서드에서는 사용할 수 없고 인스턴스 메서드에서만 사용할 수 있다.
        
        super()
        
        → 조상 클래스의 생성자를 호출하는데 사용
        
        → Object 클래스를 제외한 모든 클래스의 생성자 첫 줄에 생성자, this() 또는 super()를 호출해야 한다. 그렇지 않으면 컴파일러가 자동적으로 super()를 생성자의 첫 줄에 삽입한다.
        
    
    ---
    
    - package와 import
        
        → package란 클래스의 묶음이다. 패키지에는 클래스 또는 인터페이스를 포함시킬 수 있으며, 서로 관련된 클래스들끼리 그룹 단위로 묶어 놓음으로써 클래스를 효율적으로 관리할 수 있다.
        
        → import란 컴파일러에게 소스파일에 사용된 클래스의 패키지에 대한 정보를 제공하는 것이다.
        
        ▪️static import
        
        → static import를 사용하면 static맴버를 호출할 때 클래스 이름을 생략할 수 있다.
        
        ```java
        System.out.println(Math.random());
        -> System.out.println(random());
        ```