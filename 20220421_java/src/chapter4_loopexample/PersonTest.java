package chapter4_loopexample;


public class PersonTest {
   
	 public static void main(String[] args) {
		  Person personKim = new Person();
		  personKim.name = "������";
		  personKim.weight = 85.5F;
		  personKim.height = 180.0F;
		
		  Person personLee = new Person("�̼���", 175, 75);

		  Person p1 = new Person();
		  Person p2 = new Person("���ֿ�",1234);
		  Person p3 = new Person("���ֿ�",1234);
		  Person p4 = new Person("���ֿ�",10.f,10);
	
	 
	 p1.move();
	p1. eat();
	 }
}
