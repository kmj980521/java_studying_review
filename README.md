# REVIEW-JAVA-8

자바 복습하기 8일차

Class 클래스를 가져올 수 있다면, 해당 클래스 정보, 즉 생성자 메서드 멤버 변수 정보를 찾을 수 있다. 이 정보를 활용하여 인스턴스를 생성하거나 메서드를 호출하는 방식을 **리플렉션**이라고 한다.

어떤 값이 하나의 참조 자료형이 아닌 여러 참조 자료형을 사용할 수 있도록 프로그래밍하는 것을 **제네릭 프로그래밍**이라고 한다.

필요한 자료 구조를 미리 구현하여 java.util 패키지에서 제공하고 있는데 이를 **컬렉션 프레임워크**라고 한다.

하나의 자료를 모아서 관리하는 **Collection 인터페이스**와 쌍으로된 자료들을 관리하는 **Map 인터페이스**가 있다. Collection인터페이스에는 리스트와 Set인터페이스가 있다.

ArrayList() 디폴트 생성자를 호출하여 배열 크기를 지정하지 않으면 크기가 10개짜리인 배열이 기본적으로 생성. 추가적으로 데이터가 들어오면, 더 큰 길이의 배열을 만들고 기존 항목들을 복사함.

Vector 클래스와 ArrayList 클래스의 큰 차이점은 **동기화 지원 여부**이다. 동기화란 두 개 이상의 스레드가 동시에 Vector를 사용할 때 오류가 나지 않도록 실행 순서를 보장한다는 것.

**스레드** : 작업 단위. 하나의 스레드만 수행되면 단일 스레드, 두 개 이상의 스레드가 동시에 실행되는 경우를 멀티스레드.

Collection 요소를 순회하는 Iterator / 순서가 없는 Set 인터페이스를 구현한 경우에는 get(i)같은 메서드를 사용할 수 없으므로 , Iterator사용. 

**Iterator<클래스> ir = arrayList(선언한 ArrayList) .iterator();** 형식으로 사용

순서와 상관없이 중복을 허용하지 않는 경우 Set 인터페이스를 구현. HashSet와 TreeSet가 있다.

**HashSet클래스는 중복된 값을 추가하지 않는다**. ArrayList와 다르게 HashSet는 추가한 순서와 상관없이 출력한다.

**TreeSet 클래스를 사용하려면 자료형으로 쓰는 클래스에 implements Comparable<자료형이름> 형식**을 사용해야한다.

**Comparable인터페이스에는 compareTo() 추상 메서드**가 포함되어 있어서 이 것을 구현해야한다. return 값이 양수면 오른쪽 자식노드로, 음수면 왼쪽 자식노드로 값이 저장된다. 

Comparator 역시 정렬을 구현하는 데 사용하는 인터페이스. 이 인터페이스는 **compare()메서드**를 구현해야한다. 

**Map인터페이스**는 자료를 쌍으로 관리하는 데 필요한 메서드. 

HashMap클래스는 자료를 쌍으로 관리하는 데 필요. key-value 쌍으로 이루어진 객체의 key값은 유일하며, value값은 중복될 수 있다.

**HashMap 클래스** 자료를 관리하는 방식은 해시 방식. **hashCode()** 해시 방식의 자료를 저장하는 공간을 **해시 테이블** 이라고함.

**Map 인터페이스는 모든 자료를 한 번에 순회할 수 있는 방법이 없다**

hashmap.keySet() 메서드를 이용하면 모든 ky값이 Set 객체로 반환. 
