package M1;

public class StudentDatabase 
{
	public StudentDatabase(String iD, String name, String sex) 
	{
		super();
		ID = iD;
		this.name = name;
		this.sex = sex;
	}
	String ID;
	String name;
	String sex;
	public String getID() 
	{
		return ID;
	}
	public void setID(String iD) 
	{
		ID = iD;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getSex() 
	{
		return sex;
	}
	public void setSex(String sex) 
	{
		this.sex = sex;
	}
	
}
