package main.java.chat;

import edu.smu.tspell.wordnet.NounSynset;
import edu.smu.tspell.wordnet.Synset;
import edu.smu.tspell.wordnet.SynsetType;
import edu.smu.tspell.wordnet.WordNetDatabase;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WordnetConnecter.initialize();
		
		NounSynset nounSynset; 
		NounSynset[] hyponyms;
		String[] temp2 = new String[10];

		WordNetDatabase database = WordNetDatabase.getFileInstance(); 
		Synset[] synsets = database.getSynsets("hobby", SynsetType.NOUN); 
		for (int i = 0; i < synsets.length; i++) { 
		    nounSynset = (NounSynset)(synsets[i]); 
		    hyponyms = nounSynset.getHyponyms();
		    String temp = nounSynset.getWordForms()[0];
		    temp2[i] = temp;
		    
		    System.err.println(nounSynset.getWordForms()[0] + 
		            ": " + nounSynset.getDefinition() + ") has " + hyponyms.length + " hyponyms   " + temp2[i]); 
		    
		}

	}

}
