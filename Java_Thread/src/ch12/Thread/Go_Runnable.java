package ch12.Thread;

public class Go_Runnable implements Runnable {
	//Runnable �������̽��� �����ϴ� Go_Runnable Ŭ������ ����.
	// ���� Runnable �������̽��� ������ �߱� ������ 
	// Go_Runnable Ŭ������ ���� ������� �ƴϴ�. 
	   public void run() {
	         while(true){
	          System.out.println("go");
	         }
	         // Go_Runnable Ŭ�������� run() �޼ҵ带 �������̵��ϰ�,
	         // �޼ҵ� ������ ���ѷ����� �����Ѵ�.
	      }
	  }