package main.java.chat;

import static main.java.chat.util.Util.print;
import static main.java.chat.util.Util.randomFromArray;

import java.util.ArrayList;
import java.util.HashSet;

import main.java.chat.component.Response;
import edu.smu.tspell.wordnet.NounSynset;
import edu.smu.tspell.wordnet.Synset;
import edu.smu.tspell.wordnet.SynsetType;
import edu.smu.tspell.wordnet.VerbSynset;
import edu.smu.tspell.wordnet.WordNetDatabase;

public class WordnetConnecter {
	
	private static WordNetDatabase database = null;
	private static Synset[] synsetList=null;
	
	public WordnetConnecter(){
		System.setProperty("wordnet.database.dir", "lib/Wordnet/2.1/dict/");
		database = WordNetDatabase.getFileInstance();
	}
	
	
	
	public static void initialize(){
		//create a wordform
		
		String wordForm = "";
		
		synsetList = database.getSynsets(wordForm);
		for(int i = 0; i < synsetList.length; i++){
			String[] wordForms = synsetList[i].getWordForms();
		}
				
		
	}//init
	
	//C:/Users/kento_s/Documents/cosc310newproj/MyChatProgram/lib/dict/
	
	public static String[] getSynonyms(String word){
		
		initialize();
		
			NounSynset nounSynset = null; 
			String[] wordForm = new String[10];
			
			String synsetString = word;
			String tempWord = "";
			
			WordNetDatabase database = WordNetDatabase.getFileInstance();
			Synset[] synsets = null;
			

				synsets = database.getSynsets(synsetString, SynsetType.NOUN);
			 
			

				for (int i = 0; i < wordForm.length; i++) {
					if(i > synsets.length){
						i = wordForm.length;
					}
					else{
						nounSynset = (NounSynset)(synsets[i]);
						tempWord = nounSynset.getWordForms()[0];
						wordForm[i] = tempWord;
					}
				    
				}
				return wordForm;
			
	}

public WordNetDatabase getDatabase() {
	return database;
}



public Synset[] getSynsetList() {
	return synsetList;
}

}

