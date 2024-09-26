
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class Dictionary {
	
	private HashMap<String, String> dictionary = new HashMap<>();
	
	//method to have dictionary read a specified file and save the contents into itself
	public void loadDictionary(String filePath) {
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line;
			while((line = br.readLine()) != null) {
				String[] keyValue = line.split(","); //tells the reader to split each line based on the comma.
				if(keyValue.length == 2) { //when the keyValue has both parts it will save them into the hashmap. 
					dictionary.put(keyValue[0].trim(), keyValue[1].trim());
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}//end loadDictionary
	
	
	//method to print the entire contents of the contents loaded into the dictionary
	public void printDictionary() {
		for(String word : dictionary.keySet()) {
			System.out.println("Word: "+ word + ", Definition: "+ dictionary.get(word));
		}
	}//end printDictionary
	
	//method to search for a specific word listed in the dictionary. This method will return the word, definition and hashcode of the key
	public void searchDictionary(String key) {
		if(dictionary.containsKey(key)) {
			System.out.println("word: "+key);
			System.out.println("Definition: "+ dictionary.get(key));
			System.out.println("Hashcode: "+ key.hashCode());
		}else {
			System.out.println("Word not found!");
		}
	}
}//end class
