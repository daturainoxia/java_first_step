package ch12.Thread;

public class Ex12_6 {
	   public static void main( String [] args ) {
	        
	           Thread t2 = new Thread( new GooGoo_Yield(2) );
	           Thread t3 = new Thread( new GooGoo_Yield(3) );
	           Thread t4 = new Thread( new GooGoo_Yield(4) );
	           Thread t5 = new Thread( new GooGoo_Yield(5) );
	           Thread t6 = new Thread( new GooGoo_Yield(6) );
	           Thread t7 = new Thread( new GooGoo_Yield(7) );
	           Thread t8 = new Thread( new GooGoo_Yield(8) );
	           Thread t9 = new Thread( new GooGoo_Yield(9) );
	           // �� 8���� GooGoo Ŭ������ �̿��ϴ� ������ ��ü�� ����.
	           t2.setPriority(4);
	           t3.setPriority(4);
	           t4.setPriority(4);
	           t5.setPriority(4);
	           t6.setPriority(4);
	           t7.setPriority(6);
	           t8.setPriority(5);
	           t9.setPriority(5);
	        //8���� �������� �켱���� ������ ������ ����.
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
	          //"main() ����........." ���ڿ��� ����Ͽ� Main �����嵵 �������� �˸�.
	      }
	 }