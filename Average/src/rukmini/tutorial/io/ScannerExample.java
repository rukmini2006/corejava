package rukmini.tutorial.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ScannerExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//readFileUsingScanner();
		jFileChooser();
		
		

	}
public static void readFileUsingScanner() throws IOException {
	File file = new File("C:\\Users\\rukmini.mortha\\git\\corejava\\Average\\src\\rukmini\\tutorial\\collections\\sortObjects\\Person.java");
	Scanner scan = new Scanner(file);
	while(scan.hasNext()){
		System.out.println(scan.nextLine());
	}
	scan.close();
	
}
public static void  jFileChooser() throws IOException {
	JFileChooser chooser = new JFileChooser();
	if(chooser.showOpenDialog(null) ==  JFileChooser.APPROVE_OPTION) {
		File file = chooser.getSelectedFile();
		Scanner scan = new Scanner(file);
		while(scan.hasNext()){
			System.out.println(scan.nextLine());
		}
		scan.close();
		
	}
}
}
