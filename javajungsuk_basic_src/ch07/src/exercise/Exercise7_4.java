package exercise;

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	// (1) 알맞는 코드를 넣어 완성하시오.
	public void setChannel(int channel) {
		// 매개변수가 있는 메서드는 반드시 작업 전에 넘겨받은 값의 유효성 검사 실시
		if(channel < MIN_CHANNEL || channel > MAX_CHANNEL)
			return;
		
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
	
}

public class Exercise7_4 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL : " + t.getVolume());
		
	}

}
