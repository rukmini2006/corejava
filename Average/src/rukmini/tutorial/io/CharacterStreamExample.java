package rukmini.tutorial.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
	private static String inputFile = "C:\\Users\\rukmini.mortha\\git\\corejava\\Average\\src\\rukmini\\tutorial\\collections\\sortObjects\\Person.java";
	private static String outputFile = "C:\\Users\\rukmini.mortha\\git\\corejava\\Average\\src\\rukmini\\tutorial\\collections\\sortObjects\\Person.txt";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//charStreamDirect();
charStreamUsingBuffer();

	}
	
	private static void charStreamDirect() throws IOException {
		FileReader fr =null;
		FileWriter fw  = null;
		try {
			fr = new FileReader(inputFile);
			fw = new FileWriter(outputFile);
			int c;
			while((c = fr.read()) != -1) {
				fw.write(c);
			}
			System.out.println("Written successfully ");
		} finally{
			if( fr != null){
				fr.close();
			}
			if(fw !=null){
				fw.close();
			}
		}
		
		
		
		
	}
	
	private static void charStreamUsingBuffer() throws IOException {
		FileReader fr =null;
		FileWriter fw  = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader(inputFile);
			br =new BufferedReader(fr);
			fw = new FileWriter(outputFile);
			bw = new BufferedWriter(fw);
			int c;
			while((c = br.read()) != -1) {
				bw.write(c);
			}
			System.out.println("Written successfully ");
		} finally{
			if( fr != null){
				fr.close();
			}
			if(fw !=null){
				fw.close();
			}
		}
		
	}

}
