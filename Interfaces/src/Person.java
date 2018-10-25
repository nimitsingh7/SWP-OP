
public class Person implements IBiggerThan{
	private String name;
	private String firstname;
	int age;
	
	public Person(String name, String firstname, int age) {
		super();
		this.name = name;
		this.firstname = firstname;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isBiggerthan(IBiggerThan o)
	{
		Person p = (Person) o;
		
		int slength;
		
		if(this.name.length() < p.getName().length())
		{
			slength = this.name.length();
		}
		else
		{
			slength = p.getName().length();
		}
		
		for(int i = 0; i < slength; i++)
		{
			if(this.name.charAt(i) < p.getName().charAt(i))
			{
				return true;
			}
			else if(this.name.charAt(i) > p.getName().charAt(i))
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean isSmallerthan(Person p)
	{
		int slength;
		
		if(this.name.length() < p.getName().length())
		{
			slength = this.name.length();
		}
		else
		{
			slength = p.getName().length();
		}
		
		for(int i = 0; i < slength; i++)
		{
			if(this.name.charAt(i) > p.getName().charAt(i))
			{
				return true;
			}
			else if(this.name.charAt(i) < p.getName().charAt(i))
			{
				return false;
			}
		}
		
		return true;
	}
}