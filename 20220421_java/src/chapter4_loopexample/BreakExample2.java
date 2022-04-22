package chapter4_loopexample;

public class BreakExample2 {

	public static void main(String[] args) {

		int sum = 0;
		int num = 0;
	
		for(num=0; ; num++){
			sum += num;
			System.out.println("무한반복중");
			if(sum >= 100) 
				break;
		}
		
		System.out.println("num : " + num);
		System.out.println("sun : " +sum);
	}

}