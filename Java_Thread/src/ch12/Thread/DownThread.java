package ch12.Thread;

public class DownThread extends Thread{
	//Thread Ŭ������ ��ӹ��� UpThread Ŭ������ �ۼ�.
    SharedData data;
     String name;
  // ���� �������� SharedData Ŭ������ ��������� �����ϴ� String ���� ����
     // name �� ����. 
   public DownThread(SharedData data, String name ){
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
        // down() �޼ҵ带 ȣ���Ѵ�. SharedDate Ŭ������ ���ǵ� down() �޼ҵ�� 
        // synchronized(����ȭ)�Ǿ� �ִ�.
       }catch(Exception e){ e.printStackTrace();}
    data.down(name);
   }
 }
}