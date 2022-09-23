package ArmorTest;

public class ArmorTest2 {
	public static void main(String[] args) {
		ArmorT suit = new ArmorT();
		suit = null;
		suit.setName("mark6");
		suit.setHeight(180);
		System.out.println(suit.getName() + " : " + suit.getHeight());
	}
}
