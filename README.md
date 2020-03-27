# REVIEW-JAVA-7
자바 복습하기 7일차 

==자바의 기본 클래스==

모든 자바 클래스의 최상위 클래스인 **Object 클래스** . 

toString()메소드는 인스턴스 정보를 문자열로 반환하는 메소드. 새로 정의한 클래스.toString() 은 클래스이름 @ 해시 코드 값이 출력 됨.

String과 Integer 클래스로 인스턴스를 생성하여 출력을하면 , String 클래스는 문자열, Integer는 숫자가 그대로 출력. toString()메소드가 재정의 되어있기

equals()메소드는 기본적으로 물리적 동일성(인스턴스의 메모리 주소가 같음)을 비교한다. 단, String, Integer클래스는 값을 비교하는 메소드로 재정의 되어있고, 클래스에서 public boolean equals(Object obj) 식으로 재정의가 가능하다.

자바에서는 두 인스턴스가 같다면 hashCode()메소드에서 반환하는 해시 코드 값이 같아야 한다. 즉 equals()메소드를 재정의했다면 hashCode()메소드를 재정의해야한다.
