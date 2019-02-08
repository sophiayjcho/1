package week3;
import java.util.Scanner;

public class wordseparator 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String a = input.nextLine();
		
		StringBuilder str = new StringBuilder(a);
		for (int i = 1; i < a.length(); i++)
		{
			char s = a.charAt(i);
			if (Character.isUpperCase(s))
			{
					str.insert(i, " ");
					Character.toLowerCase(s);
			}
		}
		
		System.out.println(str);
	}

}
