/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user56
 */
public class Dictionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        DictionaryManagement a= new DictionaryManagement();
        a.insertFromFile();
        a.getData();
        //a.setdata();
        ArrayList<Word> arr= new ArrayList(a.getData());
       
      //  System.out.println(arr.get(2).getWord_target());
       arr = a.loopsa(arr);
         System.out.println("nhap tu ban muon dich");
        a.dictionaryExportToFile(arr);
       //Scanner nhap =new Scanner(System.in);
       //String S= nhap.nextLine();
         //  a.lookUp(S,arr);
       
       // ArrayList<String> nee =new ArrayList();
        //nee.add("gdfghfghfghf");
       //Word neew=new Word("a dfdgdfd",nee);
      //a.addNewWord(arr, neew);
       
              
    }

}
