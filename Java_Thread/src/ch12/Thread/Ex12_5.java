package ch12.Thread;

public class Ex12_5 {
	   public static void main( String [] args ) {
	        
	           Thread t2 = new Thread( new GooGoo_Sleep
	(2) );
	           Thread t3 = new Thread( new GooGoo_Sleep
	(3) );
	           Thread t4 = new Thread( new GooGoo_Sleep
	(4) );
	           Thread t5 = new Thread( new GooGoo_Sleep
	(5) );
	           Thread t6 = new Thread( new GooGoo_Sleep
	(6) );
	           Thread t7 = new Thread( new GooGoo_Sleep
	(7) );
	           Thread t8 = new Thread( new GooGoo_Sleep
	(8) );
	           Thread t9 = new Thread( new GooGoo_Sleep
	(9) );
	           // �����ܿ��� 2�ܺ��� 9�ܱ����� ����ϱ� ���� 
	           // �� 8���� GooGoo Ŭ������ �̿��ϴ� ������ ��ü�� ����.
	           t2.start();
	           t3.start();
	           t4.start();
	           t5.start();
	           t6.start();
	           t7.start();
	           t8.start();
	           t9.start();
	         // 8�� ����� �����带 start() �޼ҵ带 ȣ���Ͽ� ����.
	          System.out.println( "main() ����.........");   
	          // "main() ����....." ���ڿ��� ����Ͽ� Main �����嵵 ���� ������
	          // �˸���. Main �������� ������ 4����� 25������� main() �޼ҵ带 
	          // �����ϴ� ���̴�. �ᱹ, �����δ� 9���� �����尡 ����ǰ� �ִ� ��.
	          // ���� "main() ����........." ���ڿ��� ���� ���� ��µɼ��� ������,
	          // ��� ���ó�� �ٸ� ������ �߰��� ��µɼ��� �ִ�. 
	          // 9���� �����尡 ������ ���鼭 �������̱� �����̴�. 
	          
	      }
	 }