package ch12.Thread;

public class Ex12_1{
	   public static void main( String [] args ) {
	           Go g = new Go(); // Go Ŭ������ ��ü ����
	           Come c = new Come(); // come Ŭ������ ��ü ����
	           g.go(); // Go Ŭ������ go() �޼ҵ� ȣ��
	           c.come(); // Go Ŭ������ come() �޼ҵ� ȣ��
	           // 7�࿡�� go() �޼ҵ带 ���� ȣ���Ͽ���
	           // ������� "go" ���ڿ��� ��� ��µȴ�. 
	           // Go ���μ����� ����ؼ� CPU ������� �����鼭
	           // ����ǰ� �ִ�. 
	           
	      }
	 }