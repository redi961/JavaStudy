package chap07_02;

public class MessengerTest {
	public static void main(String[] args) {
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		Messenger.getConnection();
		System.out.println(iphone.getMessage());
		
	}
}
