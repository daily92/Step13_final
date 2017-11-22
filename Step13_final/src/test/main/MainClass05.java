package test.main;

public class MainClass05 {
	/* 내부 클래스 생성
	* 특정 클래스를 상속받아서 그 클래스의 기능을 추가 | override 하려는데,
	* 안돼 => 상속이 안되게 막아놨어! (중요한 클래스는 혼돈의 소지 방지 위해 막아뒀어)
	*public class Test extends String{
	*	
	*}
	* 1) 클래스에 final 붙이면 상속 못 받게
	* 	만일, String 클래스가 public class String{} 이렇게 정의 됐으면,
	* 	상속 가능
	* 	그런데, 실제로는 public final class String{} 으로 정의 되어 있음
	* 	즉, 클래스 만들 때 final 붙여서 자식 못 만들게 (상속 못 받게) 됨!
	* 	(for 혼돈 소지 방지)
	* 
	* 2) 필드, 변수에 final 붙이면 값을 바꾸지 못하게 상수화
	*/
}
