# Chapter10_Date_TimeAndFormatting

---

- Calendar Class
    
    → 지금은 잘 사용하지 않지만 Calendar.getInstance()를 사용해 날짜를 나타냈다.
    

---

- 형식화 클래스
    
    → 형식화된 데이터의 패턴을 정의해 별다른 코드 없이 원하는 값을 쉽게 얻을 수 있다.
    
    - DeciamlFormat
        
        → 숫자를 형식화 하는데 사용된다.
        
    - SimpleDateFormat
        
        → Date, Calendar를 사용해 계산한 날짜를 출력하는 방법
        
    - ChoiceFormat
        
        → 특정 범위에 속하는 값을 문자열로 변환해준다.
        
    - MessageFormat
        
        → 데이터를 정해진 양식에 맞게 출력할 수 있도록 도와준다.
        
    - java.time pkg
        
        → Date, Calendar가 갖고 있던 단점을 해결한 패키지
        
        → 날짜가 필요할 땐 : LocalDate
        
        → 시간이 필요할 땐 : LocalTime
        
        → 둘 다 필요할 땐 : LocalDateTime
        
        만약 시간대까지 필요하다면, ZoneDateTime 사용
        

---

- LocalDate and LocalTime
    
    → 자주 사용되고 유용하게 사용되는 클래스이며 java.time의 기본이 되는 클래스이다.
    
    → 필드를 변경하고 싶다면 with(), plus(), minus() method를 사용하면된다.
    
    → 변경 시 사용되는 메서드들은 항상 새로운 객체를 생성해서 반환하므로 대입 연산자를 반드시 사용해줘야 한다.
    
    → 날짜 계산 plus, minus를 대신해 더 편한 클래스 TemporalAdjusters가 있다.
    
    → 두 날짜 혹은 시간 객체의 차이를 알고 싶다면, Period, Duration 객체를 사용하자.
    
- 날짜와 시간을 출력하고 해석하는 Parsing
    
    → DateTimeFormatter를 통해 파싱을 할 수있다.