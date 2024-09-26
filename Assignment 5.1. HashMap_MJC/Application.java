import java.io.FileNotFoundException;

public class Application {

	public static void main(String[] args) throws FileNotFoundException{
		Dictionary dictionary = new Dictionary();
		
		dictionary.loadDictionary("DictionaryWordValuePairs.csv");
		
		dictionary.printDictionary();
		
		System.out.println("\n=======Word Searched=======");
		dictionary.searchDictionary("mooncalf");
		System.out.println("\n=======Next Word Searched=======");
		dictionary.searchDictionary("wright");
		System.out.println("\n=======Next Word Searched=======");
		dictionary.searchDictionary("jade");
		System.out.println("\n=======Next Word Searched=======");
		dictionary.searchDictionary("'tis");
		System.out.println("\n=======Next Word Searched=======");
		dictionary.searchDictionary("meet");
	}//end main

}//end class
