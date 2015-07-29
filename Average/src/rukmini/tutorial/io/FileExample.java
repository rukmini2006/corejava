package rukmini.tutorial.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
	static File file = new File("StudentONE.txt");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		createFile();
		writeContentToFile();
		readContentFromFile();

	}
	private static void createFile(){
		
		try{
			boolean newFile = false;
			System.out.println("Is the file exist ?" +file.exists());
			System.out.println(file.canRead());
			System.out.println(file.canExecute());
			
			if(!file.exists()){
				newFile =file.createNewFile();
			}
			System.out.println("Has a new file has been created  " +newFile);
			System.out.println("does the file exists now "+file.exists());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private static void  writeContentToFile(){
		FileWriter fw =null;
		try{
			fw = new FileWriter(file);
			fw.write("Good mornming \n folks\n ");
			fw.flush();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fw != null){
				try{
					fw.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			
		}
		
	}
	private static void readContentFromFile() throws IOException {
		char[] in = new char[50];
		FileReader fr = null;
		int size;
					fr = new FileReader(file);
					size =fr.read(in);
			
			System.out.println("size "+ " ");
			for(char c : in)
				System.out.print(c);
				if(fr!=null){
					try{
						fr.close();
					}catch(Exception exp){
						
				}
				
			}
		
		}
	}


