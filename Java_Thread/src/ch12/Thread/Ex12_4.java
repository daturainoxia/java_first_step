package ch12.Thread;

public class Ex12_4 {
	   public static void main( String [] args ) {
	        System.out.println(Thread.currentThread().getName() );
	        //Thread.currentThread() �޼ҵ�� ���� ���� ���� �������� 
	        // ������ ��� ���. getName() �޼ҵ带 �̿��Ͽ� ���� ���� 
	        // �������� �̸��� ��´�.
	        System.out.println(Thread.currentThread().getPriority() );
	        // getPriority() �޼ҵ带 ����Ͽ� ���� ���� ���� �������� 
	        // �켱���� ������ �ִ�. 
	        System.out.println( Thread.MAX_PRIORITY);
	        // ������ �켱���� �ִ밪�� ����Ѵ�. �ִ��� 100.
	        System.out.println( Thread.NORM_PRIORITY );
	        // ������ �켱���� �ִ밪�� ����Ѵ�. �⺻���� 5.
	        System.out.println( Thread.MIN_PRIORITY );
	        // ������ �켱���� �ִ밪�� ����Ѵ�. �ּҰ��� 1.
	      }
	 }