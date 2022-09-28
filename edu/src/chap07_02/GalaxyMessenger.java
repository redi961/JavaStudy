package chap07_02;

public class GalaxyMessenger implements Messenger{
	public String getMessage() {
		return "Galaxy";
	}
	public void setMessage(String msg) {
		System.out.println("Galaxy message " + msg);
	}
	public void cleanMessage() {
		System.out.println("Galaxy cleard");
	}
}
