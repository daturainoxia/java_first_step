package chapter4_loopexample;

public class Sutdent2 {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo(){
		System.out.println(studentName + "," + address);  //�̸�, �ּ�
	}
	
	public String getStudentName() {
		return studentName;
	}	
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static void main(String[] args) {
		Sutdent2 s1  = new Sutdent2();
		s1.studentName = "���ֿ�";
          String str1 = s1.getStudentName();
         System.out.println(str1);
	
	}

}
