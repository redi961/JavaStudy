package chap07_02;

public class IPhoneMessenger implements Messenger {
	public String getMessage() {
		return "IPhone";
	}
	public void setMessage(String msg) {
		System.out.println("iphone message " + msg);
	}
	public void cleanMessage() {
		System.out.println("iphone cleard");
	}
}
