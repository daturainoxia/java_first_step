package chapter4_loopexample;

import java.io.IOException;//-> ���� �ǹ̴� ������ ������.
//java ���� �ؿ� -> io ���� �ؿ�
//�ܺο� �ִ� ����(Ŭ����) �����Ë� ����ϴ� �����
//����Ű ctrl + shift +o
public class DoWhileExample {

	public static void main(String[] args)  {

		int num = 1; 
		int sum = 0;
		
		do{
			sum += num;
			num++;	
			
		}while( num <= 10  );
		
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�");
	}
}
