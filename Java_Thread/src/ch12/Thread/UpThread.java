package ch12.Thread;

public class UpThread extends Thread{
	//Thread Ŭ������ ��ӹ��� UpThread Ŭ������ �ۼ�.
    
    SharedData data;
    String name;
    // ���� �������� SharedData Ŭ������ ��������� �����ϴ� String ���� ����
    // name �� ����. 
  public UpThread(SharedData data, String name ){
       this.data = data;
       this.name = name;
       // SharedData Ŭ������ ��ü data�� String ��ü�� name �� ���� 
       // �ʱ�ȭ�ϴ� �����ڸ� �ۼ�. 
   }
   public void run(){
   for( int i=0; i < 4; i++ ){
     try{
       Thread.sleep(500);
       // sleep() �޼ҵ忡 ���� 0.5�� �������� ��ϵǸ鼭 SharedData  Ŭ������ 
       // up() �޼ҵ带 ȣ���Ѵ�. SharedDate Ŭ������ ���ǵ� up() �޼ҵ�� 
       // synchronized(����ȭ)�Ǿ� �ִ�.
    }catch(Exception e){ e.printStackTrace();}
 data.up(name);
 }
}
}