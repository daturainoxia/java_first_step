package Scheduler;

import java.security.PublicKey;

public class RoundRobin implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
		@Override
		public void sendCallToAgent() {
			System.out.println("상대 전화를 순서대로 대기열에서 가져옵니다.");
		}
		
		
	}


