package Test;

public interface Message {
	
	public abstract String getMessage();
	
	public abstract void setMessage (String msg);
	
	public static void getConnection () {
		System.out.println("network ok");
	}

}
