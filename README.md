# REVIEW-JAVA-7
자바 복습하기 7일차 

==자바의 기본 클래스==

모든 자바 클래스의 최상위 클래스인 **Object 클래스** . 

toString()메소드는 인스턴스 정보를 문자열로 반환하는 메소드. 새로 정의한 클래스.toString() 은 클래스이름 @ 해시 코드 값이 출력 됨.

String과 Integer 클래스로 인스턴스를 생성하여 출력을하면 , String 클래스는 문자열, Integer는 숫자가 그대로 출력. toString()메소드가 재정의 되어있기

equals()메소드는 기본적으로 물리적 동일성(인스턴스의 메모리 주소가 같음)을 비교한다. 단, String, Integer클래스는 값을 비교하는 메소드로 재정의 되어있고, 클래스에서 public boolean equals(Object obj) 식으로 재정의가 가능하다.

자바에서는 두 인스턴스가 같다면 hashCode()메소드에서 반환하는 해시 코드 값이 같아야 한다. 즉 equals()메소드를 재정의했다면 hashCode()메소드를 재정의해야한다.
객체 원본을 유지해 놓고 복사본을 사용한다거나, 기본 틀의 복사본을 사용해 동일한 인스턴스를 만들어 복잡한 생성 과정을 간단히 하려는 경우에는 **clone()메소드**를 사용한다. throws CloneNotSupportedException 을 클래스의 OBject clone() 이라는 재정의한 함수에 예외처리를 해주고, main에서도 해준다.
clone()메소드만 재정의하고, Cloneable인터페이스를 명시하지 않으면, clone()메소드를 호출할 때 오류 발생. 

clone()메소드를 사용할 때는 해당 클래스에 implements Cloneable 해준다.

String 클래스에서 test, 10,20,등과 같이 프로그램에서 사용되는 상수 값을 저장하는 공간을 **상수 풀**이라고 한다.

String =new String()으로 생성하는 인스턴스는 각 주소가 다른데 String a1="abc"; String a2="abc"; a1과 a2는 가리키는 주소값이 같다.

문자열은 **불변**하므로, concat()메소드를 활용할 때, 변수 값 자체가 변하는 것이 아니라 새로운 문자열이 생성된 것임.

문자열은 선언하면 도중에 바꿀 수 없으므로, 문자열이 안전하게 변경되도록 보장하는 StringBuffer 클래스와, 보장하지 않는 StringBuilder가 있다. Builder클래스가 속도가 더 
