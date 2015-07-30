package rukmini.tutorial.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteStreamExample {
	private static String inputFile = "C:\\Users\\rukmini.mortha\\git\\corejava\\Average\\src\\rukmini\\tutorial\\collections\\sortObjects\\ProfSort.java";
	private static String outputFile = "C:\\Users\\rukmini.mortha\\git\\corejava\\Average\\src\\rukmini\\tutorial\\collections\\sortObjects\\ProfSort.txt";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byteStreamDirect();
		byteStreamUsingBuffer();
		

	}
	private static void 	byteStreamDirect() throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream(inputFile);
			fos = new FileOutputStream(outputFile);
			
			int c;
			while((c = fis.read()) != -1){
				fos.write(c);
				
			}
			System.out.println("written successfully");
			
	
	
	}finally{
		
		if(fis != null){
			fis.close();
		}
		if(fos !=null){
			fos.close();
		}
	}
		
	}
	private static void byteStreamUsingBuffer() throws IOException {
		
	FileInputStream fis = null;
	FileOutputStream fos = null;
	BufferedInputStream bis= null;
	BufferedOutputStream bos= null;
	
	
	try{
		fis = new FileInputStream(inputFile);
		fos = new FileOutputStream(outputFile);
		bis = new BufferedInputStream(fis);
		bos= new BufferedOutputStream(fos);
		
		int c;
		while((c = bis.read()) != -1){
			bos.write(c);
			
		}
		System.out.println("written successfully");
		


}finally{
	
	if(fis != null){
		fis.close();
	}
	if(fos !=null){
		fos.close();
	}
}
	}

}
