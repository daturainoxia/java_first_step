package ch12.Thread;

public class SharedData {
	//���� �ٸ� �ΰ��� ��ü(DownThread �� UpThread Ŭ������ ��ü��) �����ؼ� 
	//����� SharedData Ŭ������ �ۼ��Ѵ�.
    int data;
  
   public synchronized void up (String name){
	   // SharedData Ŭ������ int �� ���� data�� ���� 1 ������Ű�� up()
	   // �޼ҵ带 �ۼ��Ѵ�. ����ȭ(synchronized)�Ǿ� �ֱ� ������ 
	   // 12 ~ 14 �� �ڵ尡 ��� ����Ǵ� ���� ����.
      System.out.print( name +" ��"+ data );
      data++;
      System.out.println( "�� "+ data +" �� ������Ŵ");
      System.out.println("=======up==========");
   }
   public synchronized void down (String name){
	   // SharedData Ŭ������ int �� ���� data�� ���� 1 ���ҽ�Ű�� down()
	   // �޼ҵ带 �ۼ��Ѵ�. ����ȭ(synchronized)�Ǿ� �ֱ� ������ 
	   // 20 ~ 22 �� �ڵ尡 ��� ����Ǵ� ���� ����.
      System.out.print( name +" ��"+ data );
      data--;
      System.out.println( "�� "+ data +" �� ���ҽ�Ŵ");
      System.out.println("=======down==========");
   }
}