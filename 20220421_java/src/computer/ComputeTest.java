package computer;

public class ComputerTest {

	public static void main(String[] args) {
		Computer noteBook = new Computer();
		Computer deskTop = new Computer();
		
		System.out.println("노트북");
		noteBook.powerOn();
		noteBook.webSu();
		System.out.println("데스크탑");
		deskTop.powerOn();
		deskTop.webSu();
	}

}
