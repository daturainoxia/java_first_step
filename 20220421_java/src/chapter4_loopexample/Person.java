package chapter4_loopexample;

public class Person {
	  String name;
	  float height;
	  float weight;
	  float numf22;
	  
	  public Person() {}
	
	  public Person(String pname) {
		   name = pname;
	  }
	  
	  public Person(String pname,float numf) {
		   name = pname;
		   numf22 = numf;
	  }
	  
	 //�߰��� ���� ������
	  public Person(String pname, float pheight, float pweight){
		   name = pname;
		   height = pheight;
		   weight = pweight;
	  }
	  
	  public void  move() {
	System.out.println("�ȱ�");	
	}
	  
	  //�Դ¸ż��� ����� �̸�:eat()
	  //���: ���� ���� ���� ���� �޴�.
	  public void eat() {
		  System.out.println("��Ÿ���յ��");
		  
		  
	  }
	  
	  
	  
	  
}   

