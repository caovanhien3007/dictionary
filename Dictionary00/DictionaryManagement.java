package Command;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
*
* @author tuann_000 & dtt
*/
import java.util.Scanner;

public class DictionaryManagement extends Dictionary {
	private  String FILENAME = "Users\\NgocHai\\eclipse-workspace\\commandline\\filetudien.txt";
	
	public void insertFromCommandline() {
		System.out.print("Số từ bạn muốn thêm là: ");
		
		int n = new Scanner(System.in).nextInt();
	
		for(int i=0; i<n; i++) {
			System.out.println("Nhập từ bạn muốn thêm: ");
			String target = new Scanner(System.in).nextLine();
			System.out.println("Nhập nghĩa của nó: ");
			String explain = new Scanner(System.in).nextLine();
			this.addWord(target, explain);
		}
		System.out.println("Xong!");
	}
	public void insertFromFile() throws IOException {
		File f = new File(FILENAME);
		FILENAME = f.getAbsolutePath().substring(0, 1) + ":\\" + FILENAME;
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			String line;
			br = new BufferedReader(new FileReader(FILENAME));
			while ((line = br.readLine()) != null) {
				String w[] = line.split("\t");
				this.addWord(w[0], w[1]);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
	public void  dictionaryExportToFile() throws IOException {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			File file = new File(FILENAME);
			if (!file.exists()) {
				file.createNewFile();
			}
			fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			for(Word w : this.dict){
				bw.write(w.getWord_target() + "\t" + w.getWord_explain() + "\r\n");
			}	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	public  void dictionaryLookup() {
		System.out.print("Nhập từ bạn muốn dịch : ");
		String search = new Scanner(System.in).nextLine();
		boolean f = false;
		for(Word w : this.dict){
			if(w.getWord_target().equals(search)) {
				System.out.println(w.getWord_explain());
				f = true;
				break;
			}
		}
		if(!f) System.out.println("Không tìm thấy từ!");
	}
	public void editWord() {
		System.out.print("Nhập từ bạn muốn chỉnh sửa: ");
		String needEdit = new Scanner(System.in).nextLine();
		System.out.print("Nhập nghĩa bạn muốn chỉnh sửa: ");
		String edit = new Scanner(System.in).nextLine();
		for(Word w : this.dict){
			if(w.getWord_target().equals(needEdit)) {
				w.setWord_explain(edit);
				break;
			}
		}
		System.out.println("Xong!");
	}
	public void deleteWord() {
		System.out.print("Nhập từ bạn muốn xóa: ");
		String delete = new Scanner(System.in).nextLine();
		for(Word w : this.dict){
			if(w.getWord_target().equals(delete)) {
				this.dict.remove(w);
				break;
			}
		}
		System.out.println("Xong!");
	}
	
	public void dictionarySearcher() {
		System.out.print("Nhập 1 vài chữ cái bạn nhớ: ");
		String suggestions = new Scanner(System.in).nextLine();
		for(Word w : this.dict){
			if(w.getWord_target().startsWith(suggestions, 0)) {
				System.out.println(w.getWord_target() + ":  " + w.getWord_explain()); 
			}
		}
	}
}