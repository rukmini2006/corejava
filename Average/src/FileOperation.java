import java.io.File;
public class FileOperation {

	public static void main(String[] args) {
		try{
	//		boolean newFile=false;
//			File  file=new File("HelloWorld.txt");
//			System.out.println(file.exists());
//			 newFile=file.createNewFile();
//			 System.out.println(newFile);
//			 System.out.println(file.exists());
//			 System.out.println(file.getAbsolutePath());
			File dir=new File("C:/Users/rukmini.mortha/git/MyGit/Average/src/helloworlddir");
			System.out.println(dir.isDirectory());
			System.out.println(dir.mkdir());
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
