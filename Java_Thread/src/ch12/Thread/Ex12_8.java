package ch12.Thread;

public class Ex12_8 {
	   public static void main( String [] args ) {
	       SharedData data = new SharedData();
	       // UpThread �� DownThread Ŭ������ ��ü�� �����ϴ� SharedData Ŭ�����Ǹ� 
	       // ��ü�� �����Ѵ�.
	        UpThread t = new UpThread( data, "UP" );
	        DownThread t2 = new DownThread( data, "Down" );
	        // UpThread �� DownThread Ŭ������ ��ü�� �����ϸ鼭 �������� 
	        // ���ڷ� ���� ��ü�� SharedData Ŭ������ ��ü�� ��������� ����.
	        // �̷��� ���� �����尡 �ϳ��� ��ü�� �����ϸ� ����ȭ ������ �߻�
	        // �Ҽ� ������, �ڹ� �������  synchronized Ű���带 ����Ͽ� 
	        // ����ȭ ������ �����Ҽ� �ִ�.
	        t.start();
	        t2.start();
	   }
	 }