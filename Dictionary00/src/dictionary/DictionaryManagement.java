/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user56
 */
public class DictionaryManagement {
    

    
    private  ArrayList<Word> newarr =new ArrayList<>();
    private ArrayList<Word> arr =new ArrayList<>() ;
    private ArrayList<String> a; 
public  void   insertFromFile()
    {
        File file =new File("Data.txt");
        try{
            int dem=0;
            Scanner infile=new Scanner(file);
            while(infile.hasNext())
            {
               
               String s = infile.nextLine();
               String q= infile.nextLine();
                 a = new ArrayList<>();
                while(!q.isEmpty())
                        {
                            
                            
                             a.add(q);
                           
                          q=infile.nextLine();
                        }
            Word newword =new Word(s,a);
            arr.add(newword);
            }
            
            }catch(Exception e){
            
                               }
       // System.out.println(arr.size());
       
        
}
public void setdata(){
     for(int i=0;i<arr.size();i++)
        {
            System.out.println("-------------"+arr.get(i).getWord_target()+"-----------------------------------");
            for(int j=0;j<arr.get(i).getWord_explain().size();j++)
            {
                System.out.println(arr.get(i).getWord_explain().get(j));
            }
            
        }
}
 public ArrayList getData() {
    
        return arr;
    }
    }
 
         