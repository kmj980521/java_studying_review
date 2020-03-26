# REVIEW-JAVA-6
자바 복습하기 6일차

인터페이스는 프로그램에 어떤 메소드를 제공하는지 미리 알려주는 명세 또는 약속의 역할을 함

인터페이스의 디폴트 메소드 : 인터페이스를 구현한 클래스에 기본적으로 제공할 메소드, 인터페이스에서 메소드를 구현을 해주고, 사용하는 클래스들에 기본적으로 제공 .. 디폴트 메소드나 정적 메소드를 추가했다고 해서 인터페이스가 인스턴스를 생성할 수 있는 것은 아님.

인터페이스에서 메소드를 구현을 하려면 함수는 **default**를 사용한다. 

인터페이스에 선언한 변수는 컴파일하면 상수로 변환된다(ex double pi = 3.14; ->> public static final double pi=3.14)

인터페이스에 선언을 한 디폴트 메소드는 클래스에서 오버라이드가 가능하다.

정적 메소드는 static 예약어를 사용해 클래스 생성과 무관하게 사용이 가능. 인터페이스 이름으로 직접 참조하여 사용.

**두 가지 인터페이스를 상속받았는데 두 가지 인터페이스에 중복이 되는 메소드가 있으면**, 상속받은 클래스에서 재정의해서 메소드를 사용한다. 인터페이스형으로 변수를 만들어내고 그 재정의된 메소드를 호출하면, 가상 메소드원리에 의해 인터페이스의 메소드가 아닌 **새로 재정의된 메소드가 호출**이 된다.

어떤 인터페이스를 상속을 받은 클래스를 선언을 하고 인스턴스를 만들고, 그 어떤 인터페이스형으로 바꿔주면 , 인터페이스의 메소드만 사용이 가능하다.

한 클래스에서 클래스의 상속과, 인터페이스의 구현이 동시에 가능하다.
