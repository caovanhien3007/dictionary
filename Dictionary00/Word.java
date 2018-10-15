/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Command;

/**
*
* @author tuann_000 & dtt
*/
public class Word {
   public  String word_target;
   public  String word_explain;

   
   public String getWord_target() {
	return word_target;
}


public void setWord_target(String word_target) {
	this.word_target = word_target;
}


public String getWord_explain() {
	return word_explain;
}


public void setWord_explain(String word_explain) {
	this.word_explain = word_explain;
}


public void setWord(String w1, String w2) {
   	this.word_target = w1;
   	this.word_explain = w2;
   }
}



