package ch12.Thread;

public class GooGoo_Join implements Runnable {
	// Runnable �������̽��� ������ Ŭ���� ����
	   private int dan;
	// ������ �� ��������� ������ ���� dan ����.
	    public GooGoo_Join( int dan){
	       this.dan = dan;// ���� dan �� �ʱ�ȭ�� �����ڸ� ����
	    }
	    public void run(){
	       try{
	          Thread.sleep(500); // 0.5�� ���� ���� ���� �����带 block ��Ŵ.
	        }catch(Exception e){ e.printStackTrace(); }
	      
	     for( int i=1 ; i<=9 ; i++ ){ 
	   System.out.println( dan+" �� : "+dan+" * " + i +" = "+ dan*i );
	     }// ���� dan �� for ���� ����Ͽ� �������� ��� 
	   }
	 }