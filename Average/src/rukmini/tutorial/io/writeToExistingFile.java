package rukmini.tutorial.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writeToExistingFile {
	static File file = new File("StudentONE.txt");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appendTextToFile();
		appendTextToFileWithoutFinally();

	}
public static void appendTextToFile() {
	PrintWriter out = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	try{
		out = new PrintWriter( new BufferedWriter(new FileWriter("StudentONE.txt",true)));
		out.println("the text");
		
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		if(out != null){
			out.close();
		}
		
	}
	
	
	
}
private static void appendTextToFileWithoutFinally() {
	try{
		PrintWriter out = new PrintWriter( new BufferedWriter(new FileWriter("Existingfile.txt",true)));
		
		out.println("the text");
		
	}catch(IOException e){
		System.err.println(e);
	}
		
}
}
