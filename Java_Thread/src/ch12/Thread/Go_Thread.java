 package ch12.Thread;

public class Go_Thread extends Thread { //Thread Ŭ������ ��ӹ��� 
	// Go_Thread Ŭ���� ����. Thread Ŭ������ ��ӹ޾Ƽ� Go_Thread�� �������̴�.
	   public void run() {
	         while(true){
	          System.out.println("go");
	         } // run() �޼ҵ带 �������̵��ϰ�, run()�޼ҵ� ������
	         // ���ѷ����� �����Ѵ�.
	      }
	  }
