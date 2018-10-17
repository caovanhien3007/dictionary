/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;


/**
 *
 * @author user56
 */
public class Word {
    String word_target ;
         ArrayList<String>   word_explain  ;
    

    public Word(String word_target, ArrayList word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
        
    }

    public Word() {
    }

    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public ArrayList getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(ArrayList word_explain) {
        this.word_explain = word_explain;
    }
   
    
}
