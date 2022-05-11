package interfaceex;

public class CalculatorTest {
	public static void main(String) [] arg){
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc =new CompleteCalc();
		System.out.println(Calc.add(num1,num2))
		System.out.println(Calc.substract(num1,num2))
		System.out.println(Calc.times(num1,num2))
		System.out.println(Calc.divide(num1,num2))
		calc.showInfo();
	}

}
