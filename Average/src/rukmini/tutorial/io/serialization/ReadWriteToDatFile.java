package rukmini.tutorial.io.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteToDatFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	//	writeObject();
		readObject();

	}

	private static void writeObject() throws IOException {
		Person per = new Person("Rukmini","Newyork","software",12334);
		
		FileOutputStream fos = new FileOutputStream("rukmini.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		//System.out.println(per.getPlace());
		oos.writeObject(per);
		oos.close();
		System.out.println("object has been written successfully ");
		
	}
	private static void readObject() throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("rukmini.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person perRead = (Person) ois.readObject();
		System.out.println("After " +perRead.getName() + " " +perRead.getProfession() + " " +perRead.getPlace() + " " +perRead.getSsn());
		
		ois.close();
	}
}

