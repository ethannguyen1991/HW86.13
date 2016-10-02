import java.util.Scanner;
public class Driver
{

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args)
	
	{

		
		String text;
		System.out.println("Enter a sample text: ");
		
		text=scanner.nextLine();
		System.out.println("You entered: "+text);

		while(true)
		{
			char ch=showMenu();

			switch(ch)
			{
			case 'c':
				int cntNonWhitespaces=getNumOfNonWSCharacters(text);
				System.out.println("Number of non-whitespace characters: "+cntNonWhitespaces);
				break;
				
			case 'w':
				int getWords=getNumOfWords(text);
				System.out.println("Number of words: "+getWords);
				break;
				
			case 'f':
				System.out.println("Enter a word or phrase to be found: ");
				String find=scanner.nextLine();
				int getFind=findText(text,find);
				System.out.println("Number of words: "+getFind);
				break;
				
			case 'r':

				String newstring=replaceExclamation(text);
				System.out.print("Edited text:"+newstring);
				break;
				
			case 's':
				newstring=shortenSpace(text);
				System.out.println("Edited text:"+newstring);
				break;
				
			case 'q':
				System.out.println("Get lost!!! ");

				System.exit(0);
			}

		}
	}

	 static char showMenu()
	{


		System.out.println("\nMENU");
		System.out.println("c - Number of non-whitespace characters");
		System.out.println("w - Number of words");
		System.out.println("f - Find text");
		System.out.println("r - Replace all !'s");
		System.out.println("s - Shorten spaces");
		System.out.println("q - Quit");

		System.out.print("\nChoose an option: ");


		char getinput=scanner.nextLine().charAt(0);

		return getinput;
	}
	 
	 static int getNumOfWords(String text) {


		String[] words=text.split("\\s+"); 

		return words.length;
	}

	static String shortenSpace(String text) {
		String temp = text.trim().replaceAll(" +", " ");
		return temp;

	}

	static String replaceExclamation(String text) {

		String temp = text.replaceAll("!", ".");
		return temp;
	}


	 static int findText(String text, String find)
	{

		int count =text.split(find, -1).length-1;
		return count;
	}

	static int getNumOfNonWSCharacters(String text) {

		text=text.trim().replaceAll("\\s","");
		return text.length();
	}


}

