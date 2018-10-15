package Command;

/**
*
* @author tuann_000 & dtt
*/
import java.util.ArrayList;

public class Dictionary extends Word{
	public ArrayList<Word> dict = new ArrayList<Word>();
	public void addWord(String w1, String w2) {
		Word w = new Word();
		w.setWord(w1, w2);
		this.dict.add(w);
	}
}
