package ch12.Thread;

public class Ex12_2 {
	   public static void main( String [] args ) {
	           Go_Thread g = new Go_Thread(); // Go_Thread Ŭ������ ��ü�� ����.
	           Come_Thread c = new Come_Thread();
	        // Come_Thread Ŭ������ ��ü�� ����.
	           g.start();
	           //Come_Thread Ŭ���� ��ü�� start() �޼ҵ带 ȣ���Ѵ�.
	           // Go_Thread Ŭ������ ��ü���� ���� start() m�޼ҵ带 ȣ���Ͽ� 
	           // Go_Tread Ŭ���� ��ü�� start() �޼ҵ忡 ���� 
	           // Com_Thread ��ü�� run() �޼ҵ尡 ������ ���鼭 ����� 
	           // ����Ѵ�. 
	           
	           c.start();
	      }
	 }