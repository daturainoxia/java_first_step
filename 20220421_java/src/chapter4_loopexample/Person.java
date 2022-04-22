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
	  
	 //추가로 만든 생성자
	  public Person(String pname, float pheight, float pweight){
		   name = pname;
		   height = pheight;
		   weight = pweight;
	  }
	  
	  public void  move() {
	System.out.println("걷기");	
	}
	  
	  //먹는매서드 만들기 이름:eat()
	  //출력: 오늘 본인 점심 먹은 메뉴.
	  public void eat() {
		  System.out.println("수타생왕돈까스");
		  
		  
	  }
	  
	  
	  
	  
}   

