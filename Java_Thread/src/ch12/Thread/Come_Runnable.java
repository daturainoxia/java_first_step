package ch12.Thread;

public class Come_Runnable implements Runnable{
	//Runnable �������̽��� �����ϴ� Come_Runnable Ŭ������ ����.
		// ���� Runnable �������̽��� ������ �߱� ������ 
		// Come_Runnable Ŭ������ ���� ������� �ƴϴ�. 
	   public void run() {
	         while(true){
	          System.out.println("come");
	         }
	         // Come_Runnable Ŭ�������� run() �޼ҵ带 �������̵��ϰ�,
	         // �޼ҵ� ������ ���ѷ����� �����Ѵ�.
	      }
	  }
	  