
public class TestArrayCopyDemo {

	public static void main(String[] args) {
		char[] copyfrom = {'a','n','i','m','a','t','i','o','n'};
		char[] copyTo = new char[3];
		System.arraycopy(copyfrom, 1, copyTo, 0, 3);
		System.out.println(new String(copyTo));
		
	}

}
