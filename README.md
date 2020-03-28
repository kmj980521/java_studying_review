# REVIEW-JAVA-8

자바 복습하기 8일차

Class 클래스를 가져올 수 있다면, 해당 클래스 정보, 즉 생성자 메서드 멤버 변수 정보를 찾을 수 있다. 이 정보를 활용하여 인스턴스를 생성하거나 메서드를 호출하는 방식을 **리플렉션**이라고 한다.

어떤 값이 하나의 참조 자료형이 아닌 여러 참조 자료형을 사용할 수 있도록 프로그래밍하는 것을 **제네릭 프로그래밍**이라고 한다.

필요한 자료 구조를 미리 구현하여 java.util 패키지에서 제공하고 있는데 이를 **컬렉션 프레임워크**라고 한다.

하나의 자료를 모아서 관리하는 **Collection 인터페이스**와 쌍으로된 자료들을 관리하는 **Map 인터페이스**가 있다. Collection인터페이스에는 리스트와 Set인터페이스가 있다.

ArrayList() 디폴트 생성자를 호출하여 배열 크기를 지정하지 않으면 크기가 10개짜리인 배열이 기본적으로 생성. 추가적으로 데이터가 들어오면, 더 큰 길이의 배열을 만들고 기존 항목들을 복사함.

Vector 클래스와 ArrayList 클래스의 큰 차이점은 **동기화 지원 여부**이다. 동기화란 두 개 이상의 스레드가 동시에 Vector를 사용할 때 오류가 나지 않도록 실행 순서를 보장한다는 것.
