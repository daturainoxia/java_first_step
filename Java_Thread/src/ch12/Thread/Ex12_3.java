package ch12.Thread;

public class Ex12_3 { 
	   public static void main( String [] args ) {
	           Go_Runnable g = new Go_Runnable();
	        // Go_Runnable Ŭ������ ��ü�� ����. ���� ������� �ƴϴ�.
	           Come_Runnable c = new Come_Runnable();
	        // Come_Runnable Ŭ������ ��ü�� ����. ���� ������� �ƴϴ�.
	           Thread t = new Thread( g );
	           // Go_Runnable Ŭ������ ��ü�� ������� �����ϱ� ���ؼ� 
	           // Thread ��ü�� �����ϸ鼭 �������� ���ڿ� 
	           //Go_Runnable ��ü�� �����Ѵ�. Thread Ŭ������ �����ڿ� 
	           // Go_Runnable Ŭ������ ��ü�� ���������ν� 
	           // ���� Go_Runnale Ŭ������ Thread��� �Ҽ� �ִ�. 
	           Thread t2 = new Thread( c );
	           // Come_Runnable Ŭ������ ��ü�� ������� �����ϱ� ���ؼ� 
	           // Thread ��ü�� �����ϸ鼭 �������� ���ڿ� 
	           //Come_Runnable ��ü�� �����Ѵ�. Thread Ŭ������ �����ڿ� 
	           // Come_Runnable Ŭ������ ��ü�� ���������ν� 
	           // ���� Come_Runnale Ŭ������ Thread��� �Ҽ� �ִ�. 
	           t.start();
	           // Go_Runnable Ŭ������ ��ü�� start() �޼ҵ带 ȣ��
	           t2.start();
	           //Come_Runnable Ŭ������ ��ü�� start() �޼ҵ带 ȣ��
	      }
	 }