package Command;

import java.io.IOException;
import java.util.Scanner;


public class Main1 extends DictionaryManagement{
      public static final int TRANSLATE = 1;
      public static final int SEARCH = 2;
      public static final int INSERT_WORD = 3;
      public static final int SHOW_ALL_WORDS = 4;
      public static final int DELETE_WORD = 5;
      public static final int EDIT_WORD = 6;
      public static final int EXIT = 7;
      private static int chucnang =0;
      
    
    public static int getChucnang() {
		return chucnang;
	}
	public static void setChucnang(int chucnang) {
		Main1.chucnang = chucnang;
	}
	//
    public static void functions(){
        System.out.println("       CHƯƠNG TRÌNH TỪ ĐIỂN       ");
        System.out.println("**********CÁC CHỨC NĂNG***********");
        System.out.println(" 1. TRA TU:                       ");
        System.out.println(" 2. TIM KIEM TU                   ");
        System.out.println(" 3. XEM TOÀN BỘ TỪ ĐIỂN :         ");
        System.out.println(" 4. THÊM TỪ MỚI VÀO TỪ ĐIỂN:      ");
        System.out.println(" 5. XÓA TỪ:                       ");
        System.out.println(" 6. SỬA TỪ:                       ");
        System.out.println(" 7. THOÁT KHỎI CHƯƠNG TRÌNH       ");
        System.out.println("                                  ");
        System.out.println();
        
    }
    //
      public static void main(String[] args) throws IOException{
       DictionaryCommandline dc = new DictionaryCommandline();
        dc.insertFromFile();
        //
          
       while (getChucnang()!= EXIT ){
    	   functions();
           Scanner sc = new Scanner(System.in);
           chucnang = sc.nextInt();
           setChucnang(chucnang);
           
           // chức năng tra từ mới
           
           if (getChucnang()== TRANSLATE){
        	   dc.dictionaryLookup() ;
           }
            // chức năng tìm kiếm từ
           
           if (getChucnang()== SEARCH){
        	   dc.dictionarySearcher() ;
           }
           // chức năng xem toàn bộ từ điển
           
           if (getChucnang()==INSERT_WORD){
        	   
        	   dc.showAllWords();
           }
           
           // chức năng thêm từ mới vào
           
           if (getChucnang() == SHOW_ALL_WORDS){
               dc.insertFromCommandline();
                                    
           }
           // chức năng xóa từ
           if (getChucnang() == DELETE_WORD ){
               dc.deleteWord();
                                    
           }
           
           if (getChucnang() == EDIT_WORD){
               dc.editWord();
           }
           
           // kết thúc chương trình
           if (getChucnang() == EXIT){
               break;
           }
       }
      }
}