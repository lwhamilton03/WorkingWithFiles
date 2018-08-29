import java.util.ArrayList;

public class WorkingFiles {

	ArrayList<Person> peopleList = new ArrayList<Person>();
	
	public void enterList(String name, String occupation, int age) 
	{
		peopleList.add(new Person(name, occupation, age));
	}
	
	public void printList()
	{
		for(int i = peopleList.size() -1; i >= 0; i--)
		{
			System.out.println(peopleList.get(i).toString());
		}
	}
	
	public void writeList()
	{
		for(int i = peopleList.size() -1; i >= 0; i--)
		{
			//TO TEXT FILE ...
		}
	}
	
}
