package test.main;
/*	final 은 숫자 혹은 문자 data 에 많이 붙어
 * 
 * 	숫자 data (int 혹은 double) 변수 혹은 필드에 final 을 붙이면,
 *  			의미 없는 숫자에 이름을 부여하는 효과가 있다.
 *  
 *  문자 data (String) 변수 혹은 필드에 final 을 붙이면, 
 *  			복잡한 문자열에 알기 쉬운 이름을 부여하는 효과가 있다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		// 원주율 (값이 바뀔 일이 없으니까, 상수니까, final 로 정의)
		final double PI= 3.141592;
		
		// 반지름이 10 인 원의 넓이 구하기
		double area= PI*10*10;
	}
}
