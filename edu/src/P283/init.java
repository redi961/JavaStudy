package P283;

public class init {

	static void display(Person p []) {
		for(int i = 0; i < p.length; i++) {
			p[i].show();
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		
		Person list []; 
		Employee em = new Employee("Kim",30,"Marketing");
		Professor pr = new Professor("Min",45,"Com");
		Student st = new Student("Hoon",23,"Soft");
		list = new Person [] {em,pr,st};
		
		for (Person v : list) {
			v.show();
		}
		
		//display(list);
		
		
	}

}
