package computer;

public class ComputerTest {

	public static void main(String[] args) {
		Computer noteBook = new Computer();
		Computer deskTop = new Computer();
		
		System.out.println("��Ʈ��");
		noteBook.powerOn();
		noteBook.webSu();
		System.out.println("����ũž");
		deskTop.powerOn();
		deskTop.webSu();
	}

}
