package exercise;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	// 이전 채널의 값을 저장할 멤버변수를 정의
	int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	// (1) 알맞는 코드를 넣어 완성하시오.
	public void setChannel(int channel) {
		// 매개변수가 있는 메서드는 반드시 작업 전에 넘겨받은 값의 유효성 검사 실시
		if(channel < MIN_CHANNEL || channel > MAX_CHANNEL)
			return;
		
		// 현재 채널을 이전 채널에 저장
		prevChannel = this.channel;
		
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setVolume(int volume) {
		// 매개변수가 있는 메서드는 반드시 작업 전에 넘겨받은 값의 유효성 검사 실시
		if(volume < MIN_VOLUME || volume > MAX_VOLUME)
			return;
		
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	// (1) 연습문제 7-4 MyTv 클래스에 gotoPrevChannel 메서드를 추가하여 완성하시오.
	public void gotoPrevChannel() {
		// 현재 체널을 이전 채널로 변경
		setChannel(prevChannel);
	}
	
}

public class Exercise7_5 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		System.out.println("CH : " + t.getChannel());
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
	}
}
