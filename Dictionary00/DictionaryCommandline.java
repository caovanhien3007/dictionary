package Command;

/**
*
* @author tuann_000 & dtt
*/
import java.io.IOException;

public class DictionaryCommandline extends DictionaryManagement {
    
    public void showAllWords(){
        String format = "%-8d %-25s %s \n";
        System.out.printf("No      |English %16s |Vietnamese \n", " ");
        int numerical_order=0;
        for(Word w : this.dict) {
        	System.out.format(format, numerical_order, w.getWord_target(), w.getWord_explain());
        	numerical_order++;
        }
    }
    public void dictionaryBasic() throws IOException {
    	super.insertFromCommandline();
    	this.showAllWords();
    }
    public void dictionaryAdvanced() throws IOException {
    	super.insertFromFile();
    	this.showAllWords();
    	super.dictionaryLookup();
    }
}