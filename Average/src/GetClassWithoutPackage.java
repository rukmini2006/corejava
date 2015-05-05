
public class GetClassWithoutPackage {

	public static void main(String[] args) {
		Class cls=java.lang.String.class;
		String clsname=cls.getName();
		String clsname1=cls.getSimpleName();
		System.out.println(" class name is : "+clsname);
		System.out.println(" simple class name is: "+clsname1);
		int mid=clsname.lastIndexOf('.')+1;
		String finalClsnmae=clsname.substring(mid);
		System.out.println(finalClsnmae);

	}

}
