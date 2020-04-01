# JAVA-REVIEW-DAY12
자바 복습하기 12일차 

1.**Buffered스트림**은 내부적으로 8,192바이트 크기의 배열을 가지고 있어서, 더 빠르게 입출력을 실행할 수 있는 버퍼링 기능을 제공한다. 버퍼링 기능을 제공하는 스트림은 **보조스트림**으로 BufferedInputStream은 InputStream을 매개변수로 받아 생성한다.
BufferedOutputStream은 역시 OutputStream을, BufferedReader는 Reader를, BufferedWriter는 Writer 클래스를 매개변수로 받는다.

Buffered 스트림은 멤버 변수로 8,192바이트 배열을 가지고 있어서, **한 번 자료를 읽을 때 8KB정보를 한꺼번에** 읽고 쓸 수 있다. 배열의 크기는 Buffered스트림 생성자 매개변수로 지정할 수도 있다.

2.**DataInputStream, OutputStream**은 메모리에 저장된 0,1상태를 그대로 읽거나 쓴다. 그래서 자료형의 크기가 그대로 보존이 된다.
