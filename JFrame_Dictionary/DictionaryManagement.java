/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            
            Scanner infile=new Scanner(file);
            String m=infile.nextLine();
            while(infile.hasNext())
            {

               String s = infile.nextLine();
               String q= infile.nextLine();
                 a = new ArrayList<>();
                 int b=0;
                while(!q.isEmpty())
                        {

                            if(b<24)
                            a.add(q);
                           
                            b++;

                          q=infile.nextLine();
                        }
            Word newword =new Word(s,a);
            arr.add(newword);
            }

            }catch(Exception e){

                               }
       // System.out.println(arr.size());


    }
public void  dictionaryExportToFile(ArrayList<Word> arr) throws IOException
    {
         FileWriter file = new FileWriter ("Data.txt");
        try           
            {
                BufferedWriter bw = new BufferedWriter(file);
                String s;
                  bw.write("Dữ liệu từ điển");
                   bw.newLine();
                for(int i=0;i<arr.size();i++)
                {
                    s=arr.get(i).getWord_target();
                    bw.write(s);
                   bw.newLine();
                ArrayList<String> exp = arr.get(i).getWord_explain();
                    for(int j=0;j<exp.size();j++)
                    {
                        bw.write(exp.get(j));
                        bw.newLine();
                    }
                   bw.newLine();
                }
                 bw.close();
        }catch(Exception e)
        {

        }

    }
public void out_data(ArrayList<Word> arr){
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
public void lookUp(String S,ArrayList<Word> arr)
            {

      int firt=0;int last =arr.size();
      int n=(firt+last)/2;

       while(!S.equals(arr.get(n).getWord_target())&&last-firt!=1)
       {


           if(S.compareTo(arr.get(n).getWord_target())>0)
           {
              firt=n;
              n=(firt+last)/2;
           }else{
               last=n;
               n=(firt+last)/2;
           }

       }
        if(S.equals(arr.get(n).getWord_target())){
            ArrayList na=arr.get(n).getWord_explain();
            for(int i=0;i<na.size();i++)
            {
           System.out.println( na.get(i)+"\n");
            }
        }else{
                    System.out.println( "bạn nhập sai hoặc từ điển chưa cập nhật");
                    }
        }
public  ArrayList addNewWord(ArrayList<Word> arr,Word a) throws IOException
{
     int firt=0;int last =arr.size();
      int n=(firt+last)/2;
      String S = a.getWord_target();
       while(last-firt!=1)
       {


           if(S.compareTo(arr.get(n).getWord_target())>0)
           {
              firt=n;
              n=(firt+last)/2;
           }else{
               last=n;
               n=(firt+last)/2;         
           }
       }
       arr.add(firt+1,a);
       DictionaryManagement nhapdulieu =new  DictionaryManagement();
        nhapdulieu.dictionaryExportToFile(arr);
        return arr;
                
}



    }


