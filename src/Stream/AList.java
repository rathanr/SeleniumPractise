package Stream;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class AList {

	public static void main(String[] args) {
		
		//Count the number of names starts with the Alphabet "A"
		ArrayList<String> names = new ArrayList<>();
		names.add("Alex");
		names.add("Anbu");
		names.add("AdamKhan");
		names.add("Rathan");
		names.add("Rajiv");
		names.add("Seethapathy");
		names.add("Jack");
		names.add("Jaison");
		names.add("Thirumalai");
		int count = 0;
		for(int i=0;i<names.size();i++)
		{
			String Actual = names.get(i);
			if(Actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
