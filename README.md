# REVIEW-JAVA-DAY4
자바 복습하기 4일차

ArrayList(객체 배열) 클래스 사용하기

1. import java.util.ArrayList; 해주기

2.ArrayList 선언은 ArrayList<자료형> 변수 =new ArrayList();

3.변수.add(new 자료형(...)); 를 통해 요소 값 추가 // 생성자 호출

4.변수.size()는 요소의 수

5.변수.get(i)은 i번째 요소의 데이터 값을 얻음.

향상된 for문 
```java
for(Book lang:library)
		{
			lang.showinfo();
		}
```

상위 클래스로 형 변환이 된 하위클래스는 재정의된 메소드(가상 메소드)를 호출한다.

하위 클래스에서 재정의 된 메소드(@Override 애노테이션을 사용)는 오버라이드를 했다.
