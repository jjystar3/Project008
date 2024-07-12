package inheritance;

public class Quiz02 {

	public static void main(String[] args) {

		BasicTV basicTV = new BasicTV();
		basicTV.isPowerOn = true;
		basicTV.channel = 7;
		basicTV.volume = 20;

		SmartTV smartTV = new SmartTV();
		smartTV.isPowerOn = true;
		smartTV.channel = 11;
		smartTV.volume = 30;
		smartTV.IP = "192.168.0.111";
		
		basicTV.showInfo();		
		smartTV.showInfo();

	}

}

class BasicTV {
	boolean isPowerOn;
	int channel;
	int volume;

	public void showInfo() {
		System.out.println("전원 상태: " + isPowerOn + ", 채널: " + channel + ", 볼륨: " + volume);
	}
}

class SmartTV extends BasicTV {
	String IP;

	public void showInfo() {
		System.out.println("전원 상태: " + isPowerOn + ", 채널: " + channel + ", 볼륨: " + volume + ", 아이피: " + IP);
	}
}