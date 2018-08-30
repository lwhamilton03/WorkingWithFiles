import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
	
	public void writeFile()
	{
		File peopleFile = new File("listPeople.txt");
		
		try 
		{
			FileWriter fw = new FileWriter(peopleFile);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(Person pep : peopleList)
			{
				bw.write(pep.toString());
				bw.newLine();
			}
			bw.flush();
			fw.close();
			bw.close();
		}
		
		catch(Exception except)
		{
			System.out.println(except);
		}
		
	//	finally
	//	{
	//		
	//	}
	// in this case put the fw. close and the bw. close in here also
		
	}
	
	
	public void makeFile(String nameOfFile)
	{
		File agePeople = new File(nameOfFile);
		
		FileWriter ff; 
		BufferedWriter bb; 
		
		try
		{
			ff = new FileWriter(agePeople); 
			bb = new BufferedWriter(ff);
			
			for(Person ppl : peopleList)
			{
				if (ppl.getAge() > 18)
				{
					bb.write(ppl.toString());
					bb.newLine();
				}
		
			}

			bb.flush();
			bb.close();
			ff.close();
		}
		
		catch(Exception excee)
		{
			System.out.println(excee);
		}
	
	}
	
	public void readFile()
	{
		try
		{
			FileReader fr = new FileReader ("AgeAbove18.txt");
			BufferedReader br = new BufferedReader(fr);
			String list; 
			
			while((list = br.readLine()) != null)
			{
				list = list.replaceAll(",", "");
				String [] listPeoplee = list.split(" ");
				
				//for(int i = 0; i <= listPeoplee.length - 1; i++)
				//{
				//	System.out.println(listPeoplee[i].toString());
				//}
			
				peopleList.add(new Person(listPeoplee[1], listPeoplee[3], Integer.parseInt(listPeoplee[5])));
			}
		}
		catch(Exception excepp)
		{
			System.out.println(excepp);
		}
	}
}
