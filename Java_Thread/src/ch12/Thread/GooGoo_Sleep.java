package ch12.Thread;

public class GooGoo_Sleep implements Runnable {
	// Runnable �������̽��� ������ Ŭ���� ����
	   private int dan;
	   // ������ �� ��������� ������ ���� dan ����.

	    public GooGoo_Sleep( int dan){
	       this.dan = dan;
	       // ���� dan �� �ʱ�ȭ�� �����ڸ� ����
	    }
	    public void run(){
	    	// run() �޼ҵ�ȿ��� ������(�����ǰ�)�� long ������ ����.
	      long sleepTime = (long)(Math.random() * 500 );
	      System.out.println(dan+"����"+ sleepTime+"��ŭ sleep..");
	      try{
	          Thread.sleep( sleepTime );
	          // Thread.sleep (sleep Time) �޼ҵ带 ����Ͽ� 
	          // ���� ���� ���� �����带 ���� sleep TIme �� ����ŭ block ��Ŵ. 
	      }catch(Exception e){
	    	  e.printStackTrace(); 
	      }

	     for( int i=1 ; i<=9 ; i++ ){
	    	 // ���� dan �� for ���� ����Ͽ� �������� ��� 
	      System.out.println( dan+" �� : "+dan+" * " + i +" = "+ dan*i );
	     }
	   }
	 }