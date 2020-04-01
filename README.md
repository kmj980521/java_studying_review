# JAVA-REVIEW-DAY12
자바 복습하기 12일차 

1.**Buffered스트림**은 내부적으로 8,192바이트 크기의 배열을 가지고 있어서, 더 빠르게 입출력을 실행할 수 있는 버퍼링 기능을 제공한다. 버퍼링 기능을 제공하는 스트림은 **보조스트림**으로 BufferedInputStream은 InputStream을 매개변수로 받아 생성한다.
BufferedOutputStream은 역시 OutputStream을, BufferedReader는 Reader를, BufferedWriter는 Writer 클래스를 매개변수로 받는다.

Buffered 스트림은 멤버 변수로 8,192바이트 배열을 가지고 있어서, **한 번 자료를 읽을 때 8KB정보를 한꺼번에** 읽고 쓸 수 있다. 배열의 크기는 Buffered스트림 생성자 매개변수로 지정할 수도 있다.

2.**DataInputStream, OutputStream**은 메모리에 저장된 0,1상태를 그대로 읽거나 쓴다. 그래서 자료형의 크기가 그대로 보존이 된다.

3.**직렬화** : 인스턴스의 어느 순간 상태를 그대로 저장하거나 네트워크를 통해 전송. 저장된 내뇽이나 전송받은 내용을 다시 복원하는 것을 **역직렬화** . ObjectInputStream과 ObjectOutputStream을 사용하고, Input,OutputStream을 생성자의 매개변수로 받아 생성한다. writeObject()와 readObject()메서드 사용. 

직렬화는 인스턴스 내용이 외부로 유출되는 것이므로 프로그래머가 직렬화하겠다는 의미로 , 클래스에 **implements Serializable을 선언**한다.

역직렬화를사용할시, 직렬화 될 수 없는 클래스가 인스턴스 변수로 있다거나 직렬화하고 싶지않은 변수는 **transient예약어**를 사용해 자료형의 기본 값으로 저장되어 출력. 객체 자료형인 경우 null이 저장 
