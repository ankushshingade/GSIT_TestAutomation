package UnderstandingAbstraction;

class Students
{
	private String name = "Ankush";
	private int age = 38;	
	
	static int getNameCount = 0, getAgeCount = 0;
	
	public String getName() {
		getNameCount++;
		return name;
	}
	
	public int getAge() {
		getAgeCount++;
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age<0)
			System.out.println("Invalid age.");
		else
			this.age = age;
	}
}
public class UnderstandingEncapsulation {

	public static void main(String[] args) {

		Students S1 = new Students();
		System.out.println(S1.getName()+ " " +S1.getAge());
		S1.getName();

		System.out.println("getNameCount= " +Students.getNameCount);
		System.out.println("getAgeCount= " +Students.getAgeCount);
		
		S1.setName("Shreeya");
		S1.setAge(8);
		System.out.println(S1.getName()+ " " +S1.getAge());
		
		System.out.println("");
		S1.setAge(-4);
		System.out.println(S1.getAge());
		
		System.out.println("");
		S1.setAge(4);
		System.out.println(S1.getAge());
		
	}

}
