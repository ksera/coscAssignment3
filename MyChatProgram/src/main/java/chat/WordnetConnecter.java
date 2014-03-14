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
	
	
	public static void initialize(){
		if(database == null){
			System.setProperty("wordnet.database.dir", "lib/Wordnet/2.1/dict/");
			database = WordNetDatabase.getFileInstance();
				
		}
	}
	
	//C:/Users/kento_s/Documents/cosc310newproj/MyChatProgram/lib/dict/
	
	public static String[] getSynonyms(String word){
		
		initialize();
		
			NounSynset nounSynset = null; 
			String[] wordForm = new String[10];
			
			String synsetString = word;
			String tempWord = "";
			
			WordNetDatabase database = WordNetDatabase.getFileInstance();
			Synset[] synsets = null;
			
			do{
				synsets = database.getSynsets(synsetString, SynsetType.NOUN);
				
			}
			while(synsets == null);
			 
			

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
}



/*



public static ArrayList<String> getSynonyms(final String word){
	
	initialize();
	
		NounSynset nounSynset; 
		NounSynset[] hyponyms; 

		String synsetString = word;
		
		//WordNetDatabase database = WordNetDatabase.getFileInstance(); 
		Synset[] synsets = database.getSynsets("hi", SynsetType.NOUN); 
		for (int i = 0; i < synsets.length; i++) { 
		    nounSynset = (NounSynset)(synsets[i]); 
		    hyponyms = nounSynset.getHyponyms(); 
		    System.err.println(nounSynset.getWordForms()[0] + 
		            ": " + nounSynset.getDefinition() + ") has " + hyponyms.length + " hyponyms"); 
		
	}
	
	
	
			
	wordForm = new ArrayList<String>();
	Synset[] synsets = database.getSynsets(synsetString);
	    	
	    	for (int i = 0; i < synsets.length; i++) { 
	    		
	    		for(String s : synsets[i].getWordForms()){
	    			wordForm.add(s);
	    		}
	    		
	    		
	    	}
	    	
	    	if(wordForm.isEmpty()){   	    		
	    		return null;
	    	}
	    	else{
	    		HashSet<String> listToSet = new HashSet<String>(wordForm);
    	    	ArrayList<String> wordFormFix = new ArrayList<String>(listToSet);
    	    	
    	    	return wordFormFix;
	    	}
	    		
	    		
	    	   
	    	    
			if( inputSentence.contains( keyword ) || keyword.equals( "" ) || inputSentence.contains(synonymString) )
			{		
				respond = true;	
				print( randomFromArray( response.getResponses() ) );
				i = synsets.length;
				break search;
			*/
	

