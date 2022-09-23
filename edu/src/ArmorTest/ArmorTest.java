package ArmorTest;


public class ArmorTest {
	public static void main(String[] args) {
		ArmorT suit1 = new ArmorT();
		ArmorT suit2 = new ArmorT();
		ArmorT suit3 = new ArmorT();

		suit1.setName("mark6");
		suit1.setHeight(180);

		suit2.setName("mark16");
		suit2.setHeight(220);

		suit3.setName("mark38");
		suit3.setHeight(200);

		System.out.println(suit1.getName() + " : " + suit1.getHeight());
		System.out.println(suit2.getName() + " : " + suit2.getHeight());
		System.out.println(suit3.getName() + " : " + suit3.getHeight());
	}
}

