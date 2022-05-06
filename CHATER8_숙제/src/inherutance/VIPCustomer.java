package inherutance;

public class VIPCustomer extends Customer {
	private int agentID; //VIP고객 상담원 아이디
	double saleRatio; //할인률
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자호출");
	}

	
	public int getAgentID() {
		return agentID;
	}
}
