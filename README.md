# Design Pattern


## SingleTone
   1. Spring 에서 사용하는 싱글톤
      1. Runtime

## Factory method

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
