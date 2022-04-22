package chapter4_loopexample;

import java.io.IOException;//-> 점의 의미는 폴더의 구분자.
//java 폴더 밑에 -> io 폴더 밑에
//외부에 있는 파일(클래스) 가져올떄 사용하는 예약어
//단축키 ctrl + shift +o
public class DoWhileExample {

	public static void main(String[] args)  {

		int num = 1; 
		int sum = 0;
		
		do{
			sum += num;
			num++;	
			
		}while( num <= 10  );
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다");
	}
}
