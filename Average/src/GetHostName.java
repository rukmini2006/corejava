import java.net.InetAddress;
import java.net.UnknownHostException;


public class GetHostName {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr=InetAddress.getLocalHost();
		byte[] ipAddr=addr.getAddress();
		String hostname=addr.getHostName();
		System.out.println(" hostname is  "+hostname);
		System.out.println(" ipadress is :"+ipAddr);
		System.out.println("ipaddress "+addr.getHostAddress());

	}

}
