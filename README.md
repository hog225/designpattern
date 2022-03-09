# Design Pattern


## SingleTone
   1. Spring 에서 사용하는 싱글톤
      1. Runtime

## 팩토리 매소드 패턴
강한결합 과 느슨한 결합
- 뉴 쓰지않고 특정 메소드를 구현해서 쓰는걸 팩토리 메서드 라고 한다.
- 소스가 바뀌는 과정이랑 이게 뭐가 좋은지를 해야 한다.
  solid - 패턴 중요하다.

### 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
- 왜 필요 한가 ?
   - 화이트쉽 만들다 -> 블랙쉽 -> 불루쉽 -> 수률양용 배 요걸 다만들라면 힘들겠지
   - OCP -> 확장에는 열려 있어야 하고 변경에는 닫혀 있어야 한다. 이를 잘 지킬 수 있다. 
     ![img.png](img/img.png)
- 중간에 추상 클레스를 둘수 있다. 자바 8 의 경우 인터페이스에서 private method 선언이 안되니까
![img.png](img.png)

- 단점 - 클래스가 늘어나는 단점이 있다.
- 변경에 닫혀있다. - 기존 코드를 변경하지 않는것 
- Spring - Calander, NumberFormat, BeanFactory

## 추상 팩토리 패턴
1. 클라이언트에서 구체적인 코드를 사용하는 걸 개선 하기 위함 !
2. 단일 책임 원칙을 잘 지켰다 !
3. 여렇 관련 객체들을 구체적인 클래스에 의존하지 않게 하기 위함 ?

## 빌더 패턴 
Creationl pattern 중 하나, SOLID ? 
1. 정의 목적 
   1. 다양한 객체 생성 문제에 대한 유현한 솔루션을 제공하기 위해 설계된 패턴 
   2. 객체의 생성과 표현 코드를 분리 (The intent of the Builder design pattern is to separate the construction of a complex object from its representation)
   
![img_2.png](img_2.png)
    ![img_1.png](img_1.png)
    - 설명 
      - Builder 에서 product를 조립 하기 위한 메서드를 정의한다.  
      - ConcreteBuilderA에서 이를 구현한다. 
      - Director 는 Builder 를 주입받아서 Product를 생성한다.
      - 클라이언트 코드에서는 

2. 장점
   1. 객체를 만드는데 복잡한 순서가 있다면 빌더 패턴을 통해 순서를 강제 하여 클라이언트 코드에서 쉽게 인스턴스를 만들수 있다.
   2. 불완적인 객체를 사용하지 못하게 할 수 있다. 
   3. Director 를 통해 복잡한 객체를 만드는 과정을 어느정도 숨길 수 있다.
   4. Builder 를 통해서 동일한 프로세서를 거치지만 다른 인스턴스를 만들 수 있다. 
3. 단점 
   1. Director Builder 를 만들어야 한다. -> 객체 생성을 추가로 해야한다.
   2. 생성 구조가 복잡해진다. 
4. Lombok

