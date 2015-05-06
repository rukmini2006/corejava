
public class AppendInsert {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer(0);
		System.out.println(sb.insert(0, "rukmini"));
		int len=sb.length();
		System.out.println(sb.insert(len,    "  prakash "));
		System.out.println(sb.insert(7, "  johnny"));
		System.out.println(sb.append("abhi"));

	}

}
